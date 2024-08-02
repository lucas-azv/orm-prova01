package iftm.edu.br.rastreamento_entregas.controller;

import iftm.edu.br.rastreamento_entregas.model.Rastreamento;
import iftm.edu.br.rastreamento_entregas.service.RastreamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rastreamentos")
public class RastreamentoController {

    @Autowired
    private RastreamentoService rastreamentoService;

    // Consultar todos os rastreamentos de um pacote específico
    @GetMapping("/{pacoteId}")
    public List<Rastreamento> consultarRastreamentos(@PathVariable Long pacoteId) {
        return rastreamentoService.buscarRastreamentosPorPacoteId(pacoteId);
    }

    // Adicionar um novo rastreamento
    @PostMapping
    public Rastreamento adicionarRastreamento(@RequestBody Rastreamento rastreamento) {
        return rastreamentoService.salvarRastreamento(rastreamento);
    }

    // Consultar um rastreamento por ID
    @GetMapping("/rastreios/{id}")
    public Rastreamento consultarRastreamento(@PathVariable Long id) {
        return rastreamentoService.buscarRastreamentoPorId(id);
    }

    // Atualizar um rastreamento
    @PutMapping("/{id}")
    public Rastreamento atualizarRastreamento(@PathVariable Long id, @RequestBody Rastreamento rastreamento) {
        return rastreamentoService.atualizarRastreamento(id, rastreamento);
    }

    // Remover um rastreamento
    @DeleteMapping("/{id}")
    public void removerRastreamento(@PathVariable Long id) {
        rastreamentoService.deletarRastreamento(id);
    }
}
