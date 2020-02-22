package br.com.bandtec.projeto02.entity;

public class Sala {
    private String nome;
    private Integer capacidade;

    public Sala(String nome, Integer capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

}
