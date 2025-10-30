package ex_lista2;
import java.util.Scanner;

public class questao_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = sc.nextInt();

        int menor, meio, maior;

        // Seleção encadeada
        if (a < b && a < c) {
            menor = a;
            if (b < c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b < a && b < c) {
            menor = b;
            if (a < c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a < b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        // Saída
        System.out.println("Ordem crescente: " + menor + ", " + meio + ", " + maior);

        sc.close();
    }
}
