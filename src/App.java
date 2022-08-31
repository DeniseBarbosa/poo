import model.ContaBancaria;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.Movimentacao;
import utils.DataUtil;

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



        var formatar = DataUtil.ConverteDataHora(conta2.getDataAbertura());
        var formatar1 = DataUtil.Hora(conta2.getDataAbertura());
        var formatar2 = DataUtil.Data(conta2.getDataAbertura());
            System.out.println(formatar);
            System.out.println(formatar1);
            System.out.println(formatar2);

        Movimentacao movimentacao = new Movimentacao("Saque", 100.00);
        System.out.println(movimentacao.toString());


    }
}
