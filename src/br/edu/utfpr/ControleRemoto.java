package br.edu.utfpr;

public interface ControleRemoto {
    void trocarCanal(Integer numeroCanal);
    Integer aumentarVolume();
    Integer abaixarVolume();
    void ligarPeloControle();
    void desligarPeloControle();
}
