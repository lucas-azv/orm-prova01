package iftm.edu.br.rastreamento_entregas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.rastreamento_entregas.model.Rastreamento;
import iftm.edu.br.rastreamento_entregas.repository.RastreamentoRepository;

import java.util.List;

@Service
public class RastreamentoService {

    @Autowired
    private RastreamentoRepository rastreamentoRepository;

    public List<Rastreamento> buscarRastreamentosPorPacoteId(Long pacoteId) {
        return rastreamentoRepository.findByPacoteId(pacoteId);
    }

    public Rastreamento salvarRastreamento(Rastreamento rastreamento) {
        return rastreamentoRepository.save(rastreamento);
    }

    public Rastreamento buscarRastreamentoPorId(Long id) {
        return rastreamentoRepository.findById(id).orElse(null);
    }

    public Rastreamento atualizarRastreamento(Long id, Rastreamento rastreamento) {
        rastreamento.setId(id);
        return rastreamentoRepository.save(rastreamento);
    }

    public void deletarRastreamento(Long id) {
        rastreamentoRepository.deleteById(id);
    }
}
