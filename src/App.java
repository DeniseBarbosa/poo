public class App {
    public static void main(String[]args){
        System.out.println("Aprendendo POO com Java");

        // instanciando uma classe e construindo um objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Denise";
        pessoa1.idade = 21;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);

        Carro carro = new Carro();
        carro.ano = 2022;
        carro.cor = "azul";
        carro.modelo = "Jeep";

        System.out.println(carro.ano);
        System.out.println(carro.cor);
        System.out.println(carro.modelo);


    }
}
