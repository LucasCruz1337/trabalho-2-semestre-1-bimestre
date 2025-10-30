//Escreva um programa que leia a matrícula de um funcionário, seu número de horas trabalhadas, 
//o valor que recebe por hora trabalhada, a qual mês se referem as informações 
//(ex: “Maio/24”) e calcule o salário desse funcionário no mês. Mostre a matrícula, o número de horas, o mês, 
//o salário total do funcionário e se o funcionário tece horas extras no mês. A quantidade normal de horas são 200h.
// O que exceder isso é considerado hora extra e deve ter um adicional no valor de 50%.

package ex_lista2;

import java.util.Scanner;

public class questao_2 {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a matrícula do funcionário: ");
        String matricula = sc.nextLine();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor que recebe por hora: ");
        double valorHora = sc.nextDouble();

        sc.nextLine(); // consumir quebra de linha
        System.out.print("Digite o mês de referência (ex: Maio/24): ");
        String mes = sc.nextLine();

        // Cálculo do salário
        int horasNormais = Math.min(horasTrabalhadas, 200);
        int horasExtras = Math.max(horasTrabalhadas - 200, 0);

        double salarioBase = horasNormais * valorHora;
        double salarioExtra = horasExtras * valorHora * 1.5;
        double salarioTotal = salarioBase + salarioExtra;

        // Saída formatada
        System.out.println("\n--- Folha de Pagamento ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Mês de referência: " + mes);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);

        if (horasExtras > 0) {
            System.out.println("O funcionário fez " + horasExtras + " horas extras.");
        } else {
            System.out.println("O funcionário não fez horas extras.");
        }

        sc.close();
    }
}  
    
    

