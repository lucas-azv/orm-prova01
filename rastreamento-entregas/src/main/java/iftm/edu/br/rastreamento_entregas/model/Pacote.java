package main.java.iftm.edu.br.rastreamento_entregas.model;

import java.util.ArrayList;
import java.util.List;

public class Pacote {

    private String id;
    private String destinatario;
    private Endereco endereco;
    private String status;
    private List<Rastreamento> rastreamentos;

    public Pacote(String id, String destinatario, Endereco endereco, String status) {
        this.id = id;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = "pendente";
    }

    private void atualizarStatus(String novoStatus, Date dataHora, String localizacao){
        this.status = novoStatus;
    }

    private String consultarInformacoes(){
        return "Destinatário: " + destinatario + "\n" + endereco + "\nStatus do pedido: " + status;
    }
}
