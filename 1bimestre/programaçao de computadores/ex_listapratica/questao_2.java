package ex_listapratica;

import java.util.Scanner;

public class questao_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n2 > n1) {
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }
        sc.close();
    }
}

