/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aulas36_a_43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class Contribuinte {

    private String nome;
    private double rendaBruta;
    private String tipoContribuinte;
    private List<Contribuinte> lista = new ArrayList();

    public List<Contribuinte> getLista() {
        return lista;
    }

    public void setLista(List<Contribuinte> lista) {
        this.lista = lista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public String getTipoContribuinte() {
        return tipoContribuinte;
    }

    public void setTipoContribuinte(String tipoContribuinte) {
        this.tipoContribuinte = tipoContribuinte;
    }

    public static final int validaEntrada(int opcao, Scanner s) {
        while (opcao != 1 && opcao != 2) {
            System.out.println("Opção incorreta!");
            System.out.println("informe 1 para Pessoa Física ou 2 para Pessoa Jurídica");
            opcao = s.nextInt();

        }
        return opcao;
    }
    public double calculoImpostoIr(double percent) {

        double valorContribuicao;
        valorContribuicao = (percent / 100) * this.rendaBruta;
        return valorContribuicao;
    }
    public double calculoImpostoIr(double percent, double parcDeducao) {

        double valorContribuicao;
        valorContribuicao = (percent / 100) * this.rendaBruta - parcDeducao;
        return valorContribuicao;
    }

}
