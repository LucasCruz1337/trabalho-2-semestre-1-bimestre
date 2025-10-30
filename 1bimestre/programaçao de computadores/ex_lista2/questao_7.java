package ex_lista2;

import java.time.LocalDate;
import java.util.Scanner;

public class questao_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int mesInformado = sc.nextInt();

        if (mesInformado < 1 || mesInformado > 12) {
            System.out.println("Valor Inválido");
        } else {
            int mesAtual = LocalDate.now().getMonthValue();

            if (mesInformado < mesAtual) {
                System.out.println("Mês já passou");
            } else if (mesInformado == mesAtual) {
                System.out.println("Mês atual");
            } else {
                System.out.println("Mês Futuro");
            }
        }
        sc.close();
    }
} 

