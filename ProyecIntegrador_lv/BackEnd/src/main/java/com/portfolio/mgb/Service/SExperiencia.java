
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.Experiencia;
import com.portfolio.mgb.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    public List <Experiencia> list() {
        
        return rExperiencia.findAll();
    }

public Optional<Experiencia> getOner(int id){
    return rExperiencia.findById(id);
}

}
