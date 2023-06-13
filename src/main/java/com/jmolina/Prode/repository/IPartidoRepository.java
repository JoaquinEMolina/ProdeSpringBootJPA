package com.jmolina.Prode.repository;

import com.jmolina.Prode.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartidoRepository extends JpaRepository<Partido, Long> {
    
}
