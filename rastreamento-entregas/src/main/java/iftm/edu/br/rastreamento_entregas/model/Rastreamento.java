package iftm.edu.br.rastreamento_entregas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rastreamento {

    @Id
    @GeneratedValue
    private Long id;
    private Date dataHora;
    private String status;
    private String localizacao;

    @ManyToOne
    private Pacote pacote;

    public Rastreamento(Date dataHora, String status, String localizacao, Pacote pacote) {
        this.dataHora = dataHora;
        this.status = status;
        this.localizacao = localizacao;
        this.pacote = pacote;
    }

    public String getResumo() {
        return "Data e hora: " + dataHora + "\nStatus: " + status + "\nLocalização: " + localizacao;
    }
}
