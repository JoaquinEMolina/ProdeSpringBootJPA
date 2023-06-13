package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Pronostico;
import java.util.List;

public interface IPronosticoService  {
    
    //Alta
    public void savePronostico(Pronostico pronostico);
    
    //Baja
    public void deletePronostico(Long idPronostico);
    
    //Consulta
    public List <Pronostico> getPronosticos();
    public Pronostico findPronostico(Long idPronostico);
    
        
}
