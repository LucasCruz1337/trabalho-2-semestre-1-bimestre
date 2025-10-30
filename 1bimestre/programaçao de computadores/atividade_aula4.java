import java.util.Scanner;

public class atividade_aula4 {
    public static void main(String[] args) {

        int A, B, C;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        A = s.nextInt();

        System.out.println("Digite o valor de B:");
        B = s.nextInt();

        System.out.println("Digite o valor de C:");
        C = s.nextInt();

        // Verifica se é um triângulo
        if (A < B + C && B < A + C && C < A + B) {

            if (A == B && B == C) {
                System.out.println("É triângulo equilátero");
            } else if (A != B && B != C && A != C) {
                System.out.println("É triângulo escaleno");
            } else {
                System.out.println("É triângulo isósceles");
            }

        } else {
            System.out.println("Não é um triângulo");
        }

        s.close();

    }}