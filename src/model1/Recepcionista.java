package model1;

import interfaces.RecepcionistaTrabalhando;

public class Recepcionista extends Pessoa implements RecepcionistaTrabalhando {
    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderOtelefone() {
        System.out.println("Eu sei atender o telefone");
        System.out.println();
    }

    @Override
    public void falarIngles() {
        System.out.println("Eu sei falar ingles");
        System.out.println();
    }
}
