package com.portfolio.mgb.Controler;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    @DeleteMapping("/personas/borrar/(id)")
    public String delatePersona(@PathVariable Long id){
       ipersonaService.delatePersona(id);
       return "La persona fue eliminada correctamente";
    }
    @PutMapping("/personas/editar/(id)")
    public Persona editPersona(@PathVariable Long id,
                                @RequestParam("nombre") String nuevaNombre,
                                @RequestParam("nombre") String nuevaApellido,
                                @RequestParam("nombre") String nuevaImg){
        Persona persona=ipersonaService.findPersona(id);
        persona.setApellido(nuevaNombre);
        persona.setApellido(nuevaApellido);
        persona.setImg(nuevaImg);
        
        ipersonaService.savePersona(persona);
        return persona;
    }
}