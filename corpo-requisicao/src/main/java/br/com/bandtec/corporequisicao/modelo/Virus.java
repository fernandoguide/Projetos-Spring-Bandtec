package br.com.bandtec.corporequisicao.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Virus {

    private String nomeCientifico;
    private String nomePopular;
    private Double taxaMortalidade;


    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public Double getTaxaMortalidade() {
        return taxaMortalidade;
    }

    public void setTaxaMortalidade(Double taxaMortalidade) {
        this.taxaMortalidade = taxaMortalidade;
    }

    @Override
    public String toString() {
        return "Virus{" +
                "nomeCientifico='" + nomeCientifico + '\'' +
                ", nomePopular='" + nomePopular + '\'' +
                ", taxaMortalidade=" + taxaMortalidade +
                '}';
    }
}
