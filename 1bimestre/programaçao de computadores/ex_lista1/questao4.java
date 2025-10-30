import java.util.Scanner;

//4 Faça um programa que peça dois números inteiros ao usuário. Depois exiba se o primeiro é maior, menor ou igual ao segundo. 
public class questao4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = s.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = s.nextInt();

    if (num1 > num2) {
        System.out.println("O primeiro número é maior que o segundo.");
    } else if (num1 < num2) {
        System.out.println("O primeiro número é menor que o segundo.");
    } else {
        System.out.println("Os dois números são iguais.");
    }

    
}}
