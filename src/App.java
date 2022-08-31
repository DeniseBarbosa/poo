import model.ContaBancaria;
import model.ContaCorrente;
import model.ContaPoupanca;

import javax.xml.transform.stream.StreamSource;

public class App {

    public  static  void main(String[]args){
        System.out.println("Banco Nubank");
        System.out.println();


        ContaCorrente conta = new ContaCorrente("001","12345", 6, 100.0);
        System.out.println("Saldo atual" + conta.getSaldo());
        System.out.println();

        conta.depositar(100.0);
        System.out.println("Saldo atual" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(50.0);
        System.out.println("Saldo atual" + conta.getSaldo());
        System.out.println();


        ContaPoupanca conta2 = new ContaPoupanca("0001", "123456", 6, 100.0);
        conta2.transferir(200.0, conta);
        System.out.println("Saldo da conta destino R$" + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo da conta destino R$" + conta.getSaldo());
        System.out.println();

    }
}
