
package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer persona
    public List<Persona> getPersona();
    //guardar objeto tipo persona
    public void savePersona(Persona persona);
    //ALIMINAR  un objeto pero se busca por el ID
    public void deletePersona(Long id);
    //buscar persona por el id
    public Persona findPersona(Long id);
}
