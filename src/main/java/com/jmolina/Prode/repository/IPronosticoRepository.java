package com.jmolina.Prode.repository;

import com.jmolina.Prode.model.Pronostico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPronosticoRepository extends JpaRepository<Pronostico, Long> {
    
}
