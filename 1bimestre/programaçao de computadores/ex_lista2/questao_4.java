//Tendo como dados de entrada a altura, o peso e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
//usando as fórmulas abaixo e exiba se a pessoa está abaixo, no peso ou acima do peso ideal.
//	homens: (72.7 * H) - 58
//	mulheres: (62.1 * H) - 44.7

package ex_lista2;

import java.util.Scanner;

public class questao_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso atual (em kg): ");
        double pesoAtual = sc.nextDouble();

        System.out.print("Digite o sexo (M para masculino / F para feminino): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        double pesoIdeal;

        // Cálculo do peso ideal
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Digite apenas M ou F.");
            sc.close();
            return;
        }

        // Exibir resultado
        System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);

        if (pesoAtual < pesoIdeal) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (pesoAtual > pesoIdeal) {
            System.out.println("Você está acima do peso ideal.");
        } else {
            System.out.println("Você está no peso ideal!");
        }

        sc.close();
    }
}

        

