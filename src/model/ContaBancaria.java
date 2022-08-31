package model;

import java.util.InputMismatchException;

public class ContaBancaria {

    private  String agencia;
    private String conta;
    private Integer digito;
    private double saldo;

    private  double VALOR_MINIMO_DEPOSITO = 10.0;

    public ContaBancaria(String agencia, String conta, Integer digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(Double valor){
        // verifica se o valor de deposito é menor que o valor minimo
        // se for não pode acontecer o deposito
        if(valor < VALOR_MINIMO_DEPOSITO){
            throw  new InputMismatchException("O valor minimo de deposito é´R$" + VALOR_MINIMO_DEPOSITO);
        }
        this.saldo = this.saldo + valor;
    }

    public Double sacar( Double valor){

        //Verifica se o valor é maior que o saldo da conta se for maior o cliente recebe uma notificação
        this.saldo = this.saldo - valor;
        return valor;
    }


    public void transferir(Double valor, ContaBancaria contaDestino){
        // efetua um saque na conta atual
        // efetua na conta de destino
        this.sacar(valor);

        contaDestino.depositar(valor);
    }


}
