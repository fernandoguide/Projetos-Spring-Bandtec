package br.com.bandtec.projeto01;

public class Animal {

    private String nome;
    private String especie;
    private Integer idade;

    public Animal(String nome, String especie, Integer idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }


    public String getEspecie() {
        return especie;
    }

    public Integer getIdade() {
        return idade;
    }

}
