package iftm.edu.br.rastreamento_entregas.controller;

import iftm.edu.br.rastreamento_entregas.model.Pacote;
import iftm.edu.br.rastreamento_entregas.service.PacoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacotes")
public class PacoteController {

    @Autowired
    private PacoteService pacoteService;

    @GetMapping
    public List<Pacote> listarPacotes() {
        return pacoteService.buscarTodosPacotes();
    }

    @PostMapping
    public Pacote adicionarPacote(@RequestBody Pacote pacote) {
        return pacoteService.salvarPacote(pacote);
    }

    @GetMapping("/{id}")
    public Pacote consultarPacote(@PathVariable Long id) {
        return pacoteService.buscarPacotePorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Pacote atualizarPacote(@PathVariable Long id, @RequestBody Pacote pacote) {
        return pacoteService.atualizarPacote(id, pacote);
    }

    @DeleteMapping("/{id}")
    public void removerPacote(@PathVariable Long id) {
        pacoteService.deletarPacote(id);
    }
}
