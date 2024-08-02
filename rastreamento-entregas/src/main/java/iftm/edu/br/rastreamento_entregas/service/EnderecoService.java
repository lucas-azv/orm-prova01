package iftm.edu.br.rastreamento_entregas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.rastreamento_entregas.model.Endereco;
import iftm.edu.br.rastreamento_entregas.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvaEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public Endereco buscaEndereco(Long id){
        return enderecoRepository.findById(id).get();
    }

    public Endereco atualizaEndereco(Long id, Endereco endereco) {
		endereco.setId(id);
		return enderecoRepository.save(endereco);
	}

    public void deletaEndereco(Long id){
        enderecoRepository.deleteById(id);
    }

}
