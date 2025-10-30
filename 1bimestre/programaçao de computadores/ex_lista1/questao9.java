import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = s.nextInt();

        if (num > 10 && num < 100) {
            // Potência ao quadrado
            int potencia = (int) Math.pow(num, 2);
            System.out.printf("O número elevado ao quadrado é: %.5f%n", (double) potencia);
        } else {
            // Raiz quadrada
            double raiz = Math.sqrt(num);
            System.out.printf("A raiz quadrada do número é: %.5f%n", raiz);
        }

        s.close();
    }
}