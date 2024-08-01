package main.java.iftm.edu.br.rastreamento_entregas.model;

import java.util.Date;

public class Rastreamento {

    private Date dataHora;
    private String status;

    public Rastreamento(Date dataHora, String status) {
        this.dataHora = dataHora;
        this.status = status;
    }

    private String getResumo(){
        return "Data e hora: " + dataHora + "\nStatus: " + status + "\nLocalização: " + localizacao;
    }
}
