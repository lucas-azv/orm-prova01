package iftm.edu.br.rastreamento_entregas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.rastreamento_entregas.model.Rastreamento;
import iftm.edu.br.rastreamento_entregas.repository.RastreamentoRepository;

@Service
public class RastreamentoService {

    @Autowired
    private RastreamentoRepository rastreamentoRepository;

    public Rastreamento salvaRastreamento(Rastreamento rastreamento){
        return rastreamentoRepository.save(rastreamento);
    }

    public Rastreamento buscaEndereco(Long id){
        return rastreamentoRepository.findById(id).get();
    }

    public Rastreamento atualizaPacote(Long id, Rastreamento rastreamento) {
		rastreamento.setId(id);
		return rastreamentoRepository.save(rastreamento);
	}

    public void deletaRastreamento(Long id){
        rastreamentoRepository.deleteById(id);
    }

    public List<Rastreamento> buscaRastreamentos() {
		List<Rastreamento> lista = new ArrayList<Rastreamento>();
		rastreamentoRepository.findAll().forEach(p -> lista.add(p));
		return lista;
	}
}
