package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Jugador;
import com.jmolina.Prode.repository.IJugadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorService implements IJugadorService {
    
    @Autowired
    private IJugadorRepository repoJugador;

    @Override
    public void saveJugador(Jugador jug) {
        repoJugador.save(jug);
    }

    @Override
    public void deleteJugador(Long id) {
        repoJugador.deleteById(id);
    }

    @Override
    public List<Jugador> traerJugadores() {
        List <Jugador> jugadoresList = repoJugador.findAll();
        return jugadoresList;
    }

    @Override
    public Jugador findJugador(Long idJugador) {
        return repoJugador.findById(idJugador).orElse(null);
        
    }

    @Override
    public Jugador editJugador(Long idJugador, String nombreJugador) {
        Jugador jugador = repoJugador.findById(idJugador).orElse(null);
        jugador.setNombre(nombreJugador);
        repoJugador.save(jugador);
        return jugador;
    }
    
}
