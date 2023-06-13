package com.jmolina.Prode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Jugador {
    @Id  
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idJugador;
    private String nombre;
    private int puntos;

    
    public Jugador() {
    }

    public Jugador(Long id, String nombre, int puntos) {
        this.idJugador = id;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    
}
