package com.jmolina.Prode.repository;

import com.jmolina.Prode.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJugadorRepository extends JpaRepository<Jugador, Long> {
    
}
