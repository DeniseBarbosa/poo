public class App {
    public static void main(String[]args){
        System.out.println("Aprendendo POO com Java");

        // instanciando uma classe e construindo um objeto
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Denise";
        pessoa1.idade = 21;
        pessoa1.setNome("Bruno");
        pessoa1.setIdade(27);


        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);
        /**System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());**/

        Carro carro = new Carro();
        carro.setAno(2022);
        carro.setCor("Perto");
        carro.setModelo("Uno");


        System.out.println(carro.getAno());
        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());

        ConstrutorPersonalizado construir = new ConstrutorPersonalizado(22, "azul");


    }
}
