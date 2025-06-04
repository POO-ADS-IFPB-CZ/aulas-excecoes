package model;

import exceptions.LimiteExcedidoException;
import exceptions.SaldoInsuficienteException;

public class ContaCorrente {

    private String titular;
    private double saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
        saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor){
        if(valor > saldo)
            throw new SaldoInsuficienteException("Saldo insuficiente");
        if(valor > 5000)
            throw new LimiteExcedidoException("Limite excedido");
        saldo -= valor;
        return true;
    }

}
