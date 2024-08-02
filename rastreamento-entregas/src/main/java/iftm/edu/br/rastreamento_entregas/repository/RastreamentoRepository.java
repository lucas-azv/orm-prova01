package iftm.edu.br.rastreamento_entregas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import iftm.edu.br.rastreamento_entregas.model.Rastreamento;

public interface RastreamentoRepository extends CrudRepository<Rastreamento, Long>{

    List<Rastreamento> findByPacoteId(Long pacoteId);
}
