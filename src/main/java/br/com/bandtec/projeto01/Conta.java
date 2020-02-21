package br.com.bandtec.projeto01;

public class Conta {
    private double saldo;
    private int saques;
    private int depositos;

    public void sacar(double valor) {
        this.saldo -= valor;
        this.saques++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        this.depositos++;
    }

    public int getOperacoes() {
        return saques + depositos;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getSaques() {
        return saques;
    }

    public int getDepositos() {
        return depositos;
    }
}
