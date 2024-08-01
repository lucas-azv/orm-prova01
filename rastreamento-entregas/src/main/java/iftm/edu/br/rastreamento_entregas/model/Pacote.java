package iftm.edu.br.rastreamento_entregas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pacote {

    @Id
    @GeneratedValue
    private Long id;
    private String idPacote;
    private String destinatario;

    @ManyToOne
    private Endereco endereco;

    private String status;

    @OneToMany(mappedBy = "pacote")
    private List<Rastreamento> rastreamentos = new ArrayList<>();

    public Pacote(String idPacote, String destinatario, Endereco endereco) {
        this.idPacote = idPacote;
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.status = "pendente";
    }

    public void atualizarStatus(String novoStatus, Date dataHora, String localizacao) {
        this.status = novoStatus;
        Rastreamento rastreamento = new Rastreamento(dataHora, novoStatus, localizacao, this);
        rastreamentos.add(rastreamento);
    }

    public String consultarInformacoes() {
        String enderecoInfo = (endereco != null) ? endereco.getEnderecoCompleto() : "Não disponível";
        String rastreamentoInfo = "";

        for (Rastreamento rastreamento : rastreamentos) {
            rastreamentoInfo += rastreamento.getResumo() + "\n";
        }

        return "ID do Pacote: " + idPacote + "\n" +
               "Destinatário: " + destinatario + "\n" +
               "Endereço: " + enderecoInfo + "\n" +
               "Status do pedido: " + status + "\n" +
               "Rastreamento Histórico:\n" +
               rastreamentoInfo;
    }
}

