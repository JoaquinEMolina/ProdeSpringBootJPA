package com.jmolina.Prode.controller;


import com.jmolina.Prode.model.Jugador;
import com.jmolina.Prode.service.IJugadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class JugadorController {
    @Autowired
    private IJugadorService jugadorService;
    
    @PostMapping ("/jugadores/crear")
    public String saveJugador (@RequestBody Jugador jug){
        jugadorService.saveJugador(jug);
        return "El jugador fue guardado correctamente.";
    }
    
    @GetMapping ("/jugadores/traer")
    public List <Jugador> getJugadores(){
        return jugadorService.traerJugadores();
    }
    
    @DeleteMapping("/jugadores/borrar/{id}")
    public String borrarJugadior(@PathVariable Long idJugador){
        jugadorService.deleteJugador(idJugador);
        return "El jugador fue borrado exitosamente.";
    }
    
    @PutMapping ("/jugadores/editar/{id_jugador}")
    public Jugador editarJugador(@PathVariable Long idJugador,
        @RequestParam(required = false, name = "idJugador") Long nuevaId,
        @RequestParam(required = false, name = "nombre") String nombreNuevo){
        
        Long idFinal = nuevaId;
        if (nuevaId==null){
            idFinal = idJugador;
        }
        jugadorService.editJugador(idFinal, nombreNuevo);
        Jugador jugador = jugadorService.findJugador(idFinal);
        
        return jugador;
        
    } 
    
    
    
    
}
