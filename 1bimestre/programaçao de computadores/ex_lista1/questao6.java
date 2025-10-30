//6 Faça um programa que peça ao usuário um número inteiro qualquer e exiba esse número elevado a 2, 4, 6, 8 e 10.

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){
        int num ;
        Scanner s= new Scanner(System.in);
        System.out.print("informe o primeiro numero ");
        num = s.nextInt();

        System.out.println("numero nao informado "+ num);
        System.out.println("num elevado a 2:"+ Math.pow(num,2));
        System.out.println("num elevado a 4:"+ Math.pow(num,4));
        System.out.println("num elevado a 6:"+ Math.pow(num,6));
        System.out.println("num elevado a 8:"+ Math.pow(num,8));
        System.out.println("num elevado a 10:"+ Math.pow(num,10));
    }
    
}
