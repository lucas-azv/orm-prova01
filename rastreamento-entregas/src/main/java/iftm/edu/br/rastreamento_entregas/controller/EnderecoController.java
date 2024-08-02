package iftm.edu.br.rastreamento_entregas.controller;

import iftm.edu.br.rastreamento_entregas.model.Endereco;
import iftm.edu.br.rastreamento_entregas.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> listarEnderecos() {
        return enderecoService.buscarTodosEnderecos();
    }

    @PostMapping
    public Endereco adicionarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.salvarEndereco(endereco);
    }
}
