package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Jugador;
import java.util.List;

public interface IJugadorService {
    
    //alta
    public void saveJugador(Jugador jug);
    
    //baja
    public void deleteJugador(Long idJugador);
    
    //lectura
    public List<Jugador> traerJugadores();
    
    //lectura por id
    public Jugador findJugador(Long idJugador);
    
    //editar jugador
    
    public Jugador editJugador(Long idJugador, String nombreJugador);
        
   
    
}
