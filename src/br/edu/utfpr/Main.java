package br.edu.utfpr;

import java.time.LocalDate;

public class Main {

    /*
    * Criar programa orientado a objetos para caixa de supermercado
    *
    * Criar classe item com os atributos codigoDeBarras, nomeProduto, quantidade e valor
    *
    * Criar classe pedido onde receberá uma lista de item e valor total
    *
    * Criar classe PassarCompras onde terá os métodos
    * public passarItem(Item item, Pedido pedido)
    * private somarTotal(Pedido pedido)
    * public finalizarCompra();
    *
    * insira 10 produtos por linha de código
    *
    * depois simule a passagem de compras em um caixa de mercado onde recebe
    * o código de barras e a quantidade até receber um valor negativo
    *
    * quando um valor negativo imprime o comprovante da seguinte forma
    *
    * cod. barras          prdotudo         qnt         vlr total item
    * 001                   coca            4           20,00
    * 001                   salgadinho      1           5,00
    * 001                   salame          1           10,00
    * 001                   vinho           1           30,00
    * 001                   kinder-ovo      5           100,00
    * ---------------------------------------------------------
    *total                                              165,00
    *
    * */

    public static void main(String[] args) {
        Maquina maquina = new Maquina("Modelo", "Marca", LocalDate.of(2022,01,01),
                2000.0, 2000.0);
        System.out.println(maquina);
        Boolean precisaManutencao = ChecaManutencao.checaManutencao(maquina, 1);
        if(precisaManutencao){
            System.out.println("Precisa manutencação");
        } else  {
            System.out.println("Não precisa manutencão");
        }

    }
}
