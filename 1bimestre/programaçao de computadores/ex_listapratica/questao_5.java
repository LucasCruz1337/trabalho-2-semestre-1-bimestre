package ex_listapratica;

import java.util.Random;
import java.util.Scanner;

public class questao_5{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(100) + 1; // número de 1 a 100
        int chute;

        System.out.println("Tente adivinhar o número (1 a 100)!");

        do {
            System.out.print("Digite seu chute: ");
            chute = sc.nextInt();

            if (chute > numero) {
                System.out.println("Muito alto!");
            } else if (chute < numero) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Acertou! O número era " + numero);
            }

        } while (chute != numero);

        sc.close();
    } 
}
