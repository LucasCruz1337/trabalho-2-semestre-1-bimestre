//Faça um algoritmo que leia o ano de nascimento de uma pessoa, 
//calcule e exiba se: ela já tem idade para votar (16 anos ou mais); se já tem idade para tirar habilitação 
//(18 anos ou mais) ou se é menor de 16 anos “não pode nem votar nem tirar carteira”.
package ex_lista2;

import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o ano de seu nacimento :");
        int nacimento = s.nextInt();

         System.out.println("Qual o ano atual :");
        int anoatual = s.nextInt();

        int idade =(anoatual - nacimento);

    



    }

}