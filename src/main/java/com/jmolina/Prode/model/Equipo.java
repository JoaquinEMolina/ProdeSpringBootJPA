package com.jmolina.Prode.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idEquipo;
    private String nombreEquipo;

    public Equipo() {
    }

    public Equipo(Long idEquipo, String nombreEquipo) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
    }
    
    
    
    
    
}
