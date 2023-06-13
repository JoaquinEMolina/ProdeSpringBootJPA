package com.jmolina.Prode.repository;

import com.jmolina.Prode.model.Ronda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRondaRepository extends JpaRepository<Ronda, Long> {
    
}
