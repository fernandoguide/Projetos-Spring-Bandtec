package br.com.bandtec.projeto01;

public class Compra {

    private String itens;
    private Double valor;
    private Integer quantidade;

    public Compra(String itens, Double valor, Integer quantidade) {
        this.itens = itens;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
