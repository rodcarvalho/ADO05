/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi1.ado05;

import java.util.Random;

/**
 *
 * @author bispo
 */
public class Parte02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Random gerador = new Random();
        int dado, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
        for (int i = 0; i < 1000000; i++) {
            dado = gerador.nextInt(6) + 1;
            switch (dado) {
                case 1:
                
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                case 6:
                    cont6++;
                    break;

            }

        }
        System.out.println("Simule o lançamento de 1 dado de 6 faces 1.000.000 (1 milhão) de vezes consecutivas.");
        System.out.println("Face 1:   " + (double) cont1 / 10000 );
        System.out.println("Face 2:   " + (double) cont2 / 10000 );
        System.out.println("Face 3:   " + (double) cont3 / 10000 );
        System.out.println("Face 4:   " + (double) cont4 / 10000 );
        System.out.println("Face 5:   " + (double) cont5 / 10000 );
        System.out.println("Face 6:   " + (double) cont6 / 10000 );
    }

}
    

