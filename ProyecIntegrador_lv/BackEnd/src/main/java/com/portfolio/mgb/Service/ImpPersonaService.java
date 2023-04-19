
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.IPersonaService;
import com.portfolio.mgb.Repository.IPersonaRepostory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
      
    @Autowired IPersonaRepostory ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
   List<Persona> persona= ipersonaRepository.findAll();
   return persona;
    }

    @Override
    public void savePersona(Persona persona) {
      ipersonaRepository.save(persona);
    }

    @Override
    public void delatePersona(Long id) {
       ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona= ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
    
}
