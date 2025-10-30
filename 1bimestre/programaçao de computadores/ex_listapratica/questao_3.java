package ex_listapratica;

import java.util.Scanner;

public class questao_3 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = n1; i >= n2; i--) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    } 
}
