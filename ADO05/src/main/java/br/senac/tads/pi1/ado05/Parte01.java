/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.ado05;

import java.util.Scanner;

/**
 *
 * @author Kaio
 */

public class Parte01 {

    /*
    Utilize a instrução switch e o laço/loop do-while para implementar uma questão de múltipla escolha referente a alguma das outras disciplinas que
    você está cursando neste semestre. Primeiro deverá ser apresentado o enunciado da questão com as 5 opções/alternativas de resposta, que são
    (a), (b), (c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta deverá ser impresso “Resposta correta”, caso contrário
    “Resposta incorreta”. No caso de “Resposta incorreta” a questão deve ser apresentada novamente para outra tentativa. Deve ser permitido no
    máximo 3 tentativas, quando a resposta correta for escolhida deve ser informado em qual tentativa isso ocorreu, caso isso não ocorra em nenhuma
    das 3 tentativas deve ser impresso “Resposta incorreta nas 3 tentativas”.
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alternativa;
        boolean resCorreta = false;
        int contador = 1;
        
        System.out.println("A respeito dos conjuntos numéricos, de suas definições e das relações de inclusão existentes entre eles. \n");
        System.out.println("(A) O conjunto dos números naturais é formado pelos números inteiros positivos.");
        System.out.println("(B) O conjunto dos números inteiros é formado por todos os números inteiros positivos e negativos. ");
        System.out.println("(C) O conjunto dos números racionais contém o conjunto dos números reais.");
        System.out.println("(D) O conjunto dos números inteiros contém o conjunto dos números naturais."); // Alternativa Correta.
        System.out.println("(E) O conjunto dos números reais é disjunto do conjunto dos números racionais. \n");
        
        System.out.println("Digite a alternativa verdadeira: ");
        do{
            alternativa = input.next().charAt(0);
            switch(alternativa){
                case 'D':
                case 'd':
                    System.out.println("Resposta correta.");
                    resCorreta = true;
                    break;
                case 'A':
                case 'a':
                case 'B':
                case 'b':
                case 'C':
                case 'c':
                case 'E':
                case 'e':
                    contador++;
                    if(contador <= 3){
                        System.out.println("Resposta incorreta, digite novamente:");
                    }else
                        System.out.println("Resposta incorreta nas 3 tentativas.");
                    break;
                default:
                    System.out.println("Alternativa inválida, digite novamente.");
            }          
        }while(resCorreta != true && contador <= 3);
        
    }
    
}
