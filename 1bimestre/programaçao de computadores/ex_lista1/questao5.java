import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        String resultado = "número par";

        System.out.print("Informe um número: ");
        num = s.nextInt();

        if (num % 2 != 0) {
            resultado = "número ímpar";
        }

        System.out.println("Resultado: " + resultado);

        s.close();
    }
}
