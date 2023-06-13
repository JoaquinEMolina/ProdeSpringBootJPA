package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Partido;
import java.util.List;

public interface IPartidoService {
    //Alta
    public void savePartido(Partido part);
    
    //Delete
    public void deletePartido(Long idPartido);
    
    //Buscar
    //Todos
    public List <Partido> getPartidos();
    
    //Por ID
    public Partido getPartido(Long idPartido);
    
    
    
    
}
