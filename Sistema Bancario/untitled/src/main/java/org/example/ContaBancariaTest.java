package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    void deveCriarContaComSaldoInicial() {
        ContaBancaria conta = new ContaBancaria(100);
        assertEquals(100, conta.getSaldo());
    }

    @Test
    void depositoDeveAumentarSaldo() {
        ContaBancaria conta = new ContaBancaria(100);
        conta.depositar(50);
        assertEquals(150, conta.getSaldo());
    }

    @Test
    void saqueDeveDiminuirSaldo() {
        ContaBancaria conta = new ContaBancaria(100);
        conta.sacar(40);
        assertEquals(60, conta.getSaldo());
    }

    @Test
    void naoDevePermitirSaqueMaiorQueSaldo() {
        ContaBancaria conta = new ContaBancaria(100);
        assertThrows(IllegalArgumentException.class, () -> conta.sacar(200));
    }
}