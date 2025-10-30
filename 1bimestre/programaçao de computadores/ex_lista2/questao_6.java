//Faça um algoritmo que receba dois valores e um operador aritmético (+, -, /, * - 
//adição, subtração, divisão e multiplicação). Caso o símbolo seja outro, informe “Símbolo inválido”.
//'' Faça o cálculo conforme o operador informado e exiba a expressão e o resultado.

package ex_lista2;

import java.util.Scanner;

public class questao_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double num2 = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        double resultado;
        boolean valido = true;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                }
                break;
            default:
                valido = false;
                System.out.println("Símbolo inválido");
        }

        sc.close();
    }
}
    

