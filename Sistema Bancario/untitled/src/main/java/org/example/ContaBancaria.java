package org.example;

public class ContaBancaria {

    private double saldo;

    // construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // consultar saldo
    public double getSaldo() {
        return saldo;
    }

    // depositar
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        saldo += valor;
    }

    // sacar
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}