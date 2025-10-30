//7 Faça um programa que peça ao usuário dois números 
//(num1 e num2) e depois exiba o resultado das operações relacionais maior que, menor que, igual e diferente
import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = s.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = s.nextInt();

        System.out.println("Resultados das operações relacionais:");
        System.out.println(num1 + " > " + num2 + " ? " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " ? " + (num1 < num2));
        System.out.println(num1 + " == " + num2 + " ? " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " ? " + (num1 != num2));

        s.close();
    }
}

