package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Pronostico;
import com.jmolina.Prode.repository.IPronosticoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PronosticoService implements IPronosticoService {
    @Autowired
    private IPronosticoRepository repoPronostico;

    @Override
    public void savePronostico(Pronostico pronostico) {
        repoPronostico.save(pronostico);
    }

    @Override
    public void deletePronostico(Long idPronostico) {
        repoPronostico.deleteById(idPronostico);
    }

    @Override
    public List<Pronostico> getPronosticos() {
        List <Pronostico> listaPronosticos = repoPronostico.findAll();
        return listaPronosticos;
    }

    
    @Override
    public Pronostico findPronostico(Long idPronostico) {
        return repoPronostico.findById(idPronostico).orElse(null);
    }
    
    
}
