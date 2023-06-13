package com.jmolina.Prode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Ronda {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private Long idRonda;
    @OneToMany
    private List <Partido> partidos;
    @OneToMany
    private List <Pronostico> pronosticos;
    @OneToMany
    private List <Partido> listaPartidos = new ArrayList();

    public Ronda() {
    }
    
    public Ronda(Long idRonda, List<Partido> partidos) {
        this.idRonda = idRonda;
        this.partidos = partidos;
    }

    public int puntos() {
        int totalPuntos = 0;
        for (Pronostico p : pronosticos) {
            for (Partido partido : partidos) {
                if (p.getPartido().equals(partido)) {
                    if (p.getResultado() == partido.resultado(p.getEquipo())) {
                        totalPuntos++;
                    }
                }
            }
        }
        return totalPuntos;
    }
    
    
}
