import model.ContaBancaria;

import javax.xml.transform.stream.StreamSource;

public class App {

    public  static  void main(String[]args){
        System.out.println("Banco Nubank");
        System.out.println();


        ContaBancaria conta = new ContaBancaria("001","12345", 6, 100.00);
        System.out.println("Saldo atual" + conta.getSaldo());
        System.out.println();

        conta.depositar(300);
        System.out.println("Saldo atual" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(500);
        System.out.println("Saldo atual" + conta.getSaldo());
        System.out.println();

    }
}
