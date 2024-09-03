package iftm.edu.br.rastreamento_entregas.service;

import org.springframework.stereotype.Service;

import iftm.edu.br.rastreamento_entregas.model.Pacote;
import iftm.edu.br.rastreamento_entregas.repository.PacoteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacoteService {

    private final PacoteRepository pacoteRepository;

    public PacoteService(PacoteRepository pacoteRepository){
        this.pacoteRepository = pacoteRepository;
    }

    public List<Pacote> buscarTodosPacotes() {
        List<Pacote> lista = new ArrayList<>();
        pacoteRepository.findAll().forEach(lista::add);
        return lista;
    }

    public Pacote salvarPacote(Pacote pacote) {
        return pacoteRepository.save(pacote);
    }

    public Optional<Pacote> buscarPacotePorId(Long id) {
        return pacoteRepository.findById(id);
    }

    public Pacote atualizarPacote(Long id, Pacote pacote) {
        pacote.setId(id);
        return pacoteRepository.save(pacote);
    }

    public void deletarPacote(Long id) {
        pacoteRepository.deleteById(id);
    }
}
