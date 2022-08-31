package model1;

import interfaces.CamareiraTrabalhando;

public class Camareira  extends Pessoa implements CamareiraTrabalhando {
    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarACama() {
        System.out.println("Eu sei arrumar uma cama");
        System.out.println();
    }

    @Override
    public void LimparOQuarto() {
        System.out.println("Eu sei arrumar o quarto");
        System.out.println();
    }
}
