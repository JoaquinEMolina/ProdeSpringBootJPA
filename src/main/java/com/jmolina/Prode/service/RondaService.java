package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Ronda;
import com.jmolina.Prode.repository.IRondaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RondaService implements IRondaService {
    public IRondaRepository rondaRepo;

    @Override
    public void saveRonda(Ronda ronda) {
        rondaRepo.save(ronda);
    }

    @Override
    public void deleteRonda(Long idRonda) {
        rondaRepo.deleteById(idRonda);
    }

    @Override
    public List<Ronda> getRondas() {
        List <Ronda> listaRondas = rondaRepo.findAll();
        return listaRondas;
    }

    @Override
    public Ronda findRonda(Long idRonda) {
        return rondaRepo.findById(idRonda).orElse(null);
    }
    
    
    
    
}
