/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_aula24_OO;

import java.util.Scanner;

/**
 *
 * @author jsjef
 */
public class TesteAluno {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Aluno aluno = new Aluno();
        aluno.disciplinas = new String[3];
        aluno.notas = new double[3][4];

//       3. Escreva  uma  classe  para  representar  um  Aluno.  Adicione  atributos   relacionados  às  caracteristicas  de  
//       um  Aluno,  como  nome,  matricula,  curso   que  está  matriculado,  nome  de  3  disciplinas  que  está  cursando 
//       e  as  notas   dessas  3  disciplinas.  Desenvolva  um  método  para  verificar  se  o  aluno  está   aprovado  
//       (nota  maior  ou  igual  a  7)  em  uma  determinada  disciplina.   Escreva  um  programa  para  testar  essa  
//       classe,  que  pede  as  informações  do   aluno  ao  usuário  e  ao  final  informa  o  nome  das  disciplinas,  
//       mostra  as   notas  e  mostra  se  o  aluno  foi  aprovado  ou  não. 
        
        aluno.preencheDadosAluno();
        aluno.InformaNotasAluno();
        aluno.mostraResultado();

    }

}
