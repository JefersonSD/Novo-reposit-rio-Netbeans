/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula54_enumeradores_como_classes;

/**
 *
 * @author jsjef
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;
    DiaSemana diaSemana;

    public Data() {

    }

    public Data(int dia, int mes, int ano, DiaSemana diaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {

        this.mes = mes;
    }

}