package main.java.iftm.edu.br.rastreamento_entregas.model;

public class Endereco {

    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    private String getEnderecoCompleto() {
        return rua + ", " + numero + "\n" + cidade + " - " + estado + "\n" + "CEP: " + cep;
    }
}
