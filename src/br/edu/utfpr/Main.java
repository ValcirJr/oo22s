package br.edu.utfpr;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        TelevisaoNova televisaoNova = new TelevisaoNova("LG OLED", 55);
        Televisao televisaoAntiga = new TelevisaoAntiga("Caixa", 12);
        ControleRemoto controleRemoto =
                new ControleRemotoNovo(televisaoNova);

        System.out.println("Ligando televisão nova");
        televisaoNova.ligar();
        System.out.println(televisaoNova.getLigada());

        System.out.println("\n\n\nLigando televisão antiga");
        televisaoAntiga.ligar();
        System.out.println(televisaoAntiga.getLigada());

        controleRemoto.desligarPeloControle();
        System.out.println("TV nova ligada: " + televisaoNova.getLigada());

    }

}
