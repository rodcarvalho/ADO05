/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.ado05;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rodrigo Carvalho
 */
public class Parte03 {

    public static int rolarDado() {
        Random gerador = new Random();
        int numSorteado = -1;
        numSorteado = gerador.nextInt(100);
        
        return numSorteado + 1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameOn = true;
        int qtdTentativas = 5, palpite = -1;
        int numCerto = rolarDado();
        
        System.out.println("### Jogo do Adivinhe um Número ###");
        System.out.println("O número já foi selecionado!!");
        System.out.println("Tente acertar qual o número selecionado entre 1 e 100");
        System.out.println("Você tem um total de 5 tentativas");
        while(gameOn && qtdTentativas > 0) {
            palpite = input.nextInt();
            qtdTentativas--;
            
            if(palpite == numCerto) {
                System.out.println("“Parabéns, você ganhou o jogo!”");
                gameOn = false;
            } else if (palpite < numCerto && qtdTentativas > 0) {
                if (palpite == numCerto-1) {
                    System.out.println("TÁ QUENTE!");
                }
                System.out.println("Melhor aumentar seu palpite");
                System.out.println("Qual o número escolhido? Você ainta tem " + qtdTentativas + " tentativas");
            } else if(palpite > numCerto && qtdTentativas > 0) {
                if (palpite == numCerto+1) {
                    System.out.println("TÁ QUENTE!");
                }
                System.out.println("Melhor diminuir seu palpite");
                System.out.println("Qual o número escolhido? Você ainta tem " + qtdTentativas + " tentativas");
            }
            if (qtdTentativas == 0 && palpite != numCerto) {
                System.out.println("Game Over!");
                gameOn = true;
            }
        }
    }
    
}
