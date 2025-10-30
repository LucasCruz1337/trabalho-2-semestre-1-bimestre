//1. Construa um programa que exiba os valores entre dois números informados pelo usuário.

package ex_listapratica;

import java.util.Scanner;

public class questao_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int a = sc.nextInt();

        System.out.println("Digite outro numero");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
        sc.close();
        
    }
}
