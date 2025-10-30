package ex_listapratica;

import java.util.Scanner;

public class questao_4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, num;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num % 2 == 0 && num != 0) {
                soma += num;
            }
        } while (num != 0);

        System.out.println("Soma dos pares = " + soma);
        sc.close();
    }
}
