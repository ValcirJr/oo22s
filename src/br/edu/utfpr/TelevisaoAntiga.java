package br.edu.utfpr;

public class TelevisaoAntiga extends Televisao{


    public TelevisaoAntiga(String modelo, Integer polegadas) {
        super(modelo, polegadas);
    }

    @Override
    public void ligar() {
        this.setLigada(true);
    }

    @Override
    public void desligar() {
        this.setLigada(false);
    }
}
