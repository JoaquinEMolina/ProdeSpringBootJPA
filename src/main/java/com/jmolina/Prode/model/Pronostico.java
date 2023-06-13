package com.jmolina.Prode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Pronostico {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idPronostico;
    @ManyToOne
    private Partido partido;
    @ManyToOne
    private Equipo equipo;
    private ResultadoEnum resultado;

    public Pronostico() {
    }

    public Pronostico(Long idPronostico, Partido partido, Equipo equipo, ResultadoEnum resultado) {
        this.idPronostico = idPronostico;
        this.partido = partido;
        this.equipo = equipo;
        this.resultado = resultado;
    }
    public int puntos() {
        if (resultado.equals(partido.resultado(equipo)) ) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
    
    
    
    
}
