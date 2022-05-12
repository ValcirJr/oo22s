package br.edu.utfpr;

public class ControleRemotoNovo implements ControleRemoto{

    private final TelevisaoNova televisao;

    public ControleRemotoNovo(TelevisaoNova televisao) {
        this.televisao = televisao;
    }

    @Override
    public void trocarCanal(Integer numeroCanal) {
        this.televisao.setCanalAtual(numeroCanal);
    }

    @Override
    public Integer aumentarVolume() {
        return this.televisao.getVolumeAtual() + 1;
    }

    @Override
    public Integer abaixarVolume() {
        return this.televisao.getVolumeAtual() - 1;
    }

    @Override
    public void ligarPeloControle(){
        this.televisao.ligar();
    }

    @Override
    public void desligarPeloControle() {
        this.televisao.desligar();
    }
}
