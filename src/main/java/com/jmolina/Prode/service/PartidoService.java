package com.jmolina.Prode.service;

import com.jmolina.Prode.model.Partido;
import com.jmolina.Prode.repository.IPartidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService implements IPartidoService {
    @Autowired
    private IPartidoRepository partidoRepo;

    @Override
    public void savePartido(Partido part) {
        partidoRepo.save(part);
    }

    @Override
    public void deletePartido(Long idPartido) {
        partidoRepo.deleteById(idPartido);
    }

    @Override
    public List<Partido> getPartidos() {
        List <Partido> listaPartidos = partidoRepo.findAll();
        return listaPartidos;
    }

    @Override
    public Partido getPartido(Long idPartido) {
        return partidoRepo.findById(idPartido).orElse(null);
    }
    
}
