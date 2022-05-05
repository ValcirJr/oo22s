package br.edu.utfpr; // Identidade da classe

import java.time.LocalDate;

public class Maquina {

    /*
    * 1º PILAR ABSTRAÇÃO: Replicar objetos reais em torno da identidade, características e ações
    *
    * Atributos, representam as características
    *
    * Não devem ser expostos, visto que o segundo pilar da orientação a objetos é o Encapsulamento
    * */
    private String modelo;
    private String marca;
    private LocalDate ultimaManutencao;
    private Double valorDeVenda;
    private Double valorCompra;

    /*
    * construtor, método que gera um objeto dessa classe
    * deve ser chamado com um NEW na frente como:
    * Maquina m = new Maquina(/atributos/);
    *
    * Pode variar, nem sempre o construtor vai precisar de todos os atributos
    * */
    public Maquina(String modelo, String marca, LocalDate ultimaManutencao, Double valorDeVenda, Double valorCompra) {
        this.modelo = modelo;
        this.marca = marca;
        this.ultimaManutencao = ultimaManutencao;
        this.valorDeVenda = valorDeVenda;
        this.valorCompra = valorCompra;
    }

    /*
    * getter, método publico qual dá acesso aos dados de um objeto já criado dessa claase
    * */
    public String getModelo() {
        return modelo;
    }

    /*
     * getter, método publico qual manipula atributo de um objeto dessa classe
     * */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(LocalDate ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }
}
