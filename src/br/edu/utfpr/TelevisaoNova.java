package br.edu.utfpr;

public class TelevisaoNova extends Televisao{

    public TelevisaoNova(String modelo, Integer polegadas) {
        super(modelo, polegadas);
    }

    @Override
    public void ligar() {
        setLigada(true);
        System.out.println("Seja bem vindo");
    }

    @Override
    public void desligar() {
        System.out.println("Adeus!");
        setLigada(false);
    }

}
