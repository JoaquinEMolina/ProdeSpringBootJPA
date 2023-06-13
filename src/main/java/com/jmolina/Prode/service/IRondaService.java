package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Ronda;
import java.util.List;

public interface IRondaService {
    //alta
    public void saveRonda(Ronda ronda);
    
    //baja
    public void deleteRonda(Long idRonda);

    //consulta
    public List <Ronda> getRondas();
    public Ronda findRonda(Long idRonda);
    

    
}
