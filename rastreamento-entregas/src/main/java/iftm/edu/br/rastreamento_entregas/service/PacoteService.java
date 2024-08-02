package iftm.edu.br.rastreamento_entregas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.rastreamento_entregas.model.Pacote;
import iftm.edu.br.rastreamento_entregas.repository.PacoteRepository;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository pacoteRepository;

    public Pacote salvarPacote(Pacote pacote){
        return pacoteRepository.save(pacote);
    }

    public Pacote buscaPacote(Long id){
        return pacoteRepository.findById(id).get();
    }

    public Pacote atualizaPacote(Long id, Pacote pacote) {
		pacote.setId(id);
		return pacoteRepository.save(pacote);
	}

    public void deletaPacote(Long idPacote){
        pacoteRepository.deleteById(idPacote);
    }

    public List<Pacote> buscaPacote() {
		List<Pacote> lista = new ArrayList<Pacote>();
		pacoteRepository.findAll().forEach(p -> lista.add(p));
		return lista;
	}
}
