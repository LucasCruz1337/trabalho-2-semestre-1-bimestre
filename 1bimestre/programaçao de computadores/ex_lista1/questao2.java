//1 Faça um programa que peça ao usuário qual foi sua nota final no ano letivo. Se a nota for menor que 6 e maior que 4, exiba 
//“precisa fazer prova substitutiva”. Se for maior que 6 exiba “aprovado”. Senão, exiba “reprovado”.
//2 Faça um programa que peça ao usuário Nome, idade, Gênero, Cor favorita e se pratica esporte e depois exiba as informações digitadas.
//3 Faça um programa que peça ao usuário dois números (num1 e num2) e depois exiba o resultado das operações matemáticas soma, divisão, subtração e multiplicação.
//4 Faça um programa que peça dois números inteiros ao usuário. Depois exiba se o primeiro é maior, menor ou igual ao segundo. 
//5 Faça um programa que peça um número ao usuário. Exiba se esse número é Par ou Ímpar (use o mod). 
//6 Faça um programa que peça ao usuário um número inteiro qualquer e exiba esse número elevado a 2, 4, 6, 8 e 10.
//7 Faça um programa que peça ao usuário dois números (num1 e num2) e depois exiba o resultado das operações relacionais maior que, menor que, igual e diferente
//8 Faça um programa que peça ao usuário o valor do relógio de água de uma residência no dia 1º do mês e no dia 30º do mesmo mês.
// Depois mostre quantos litros foram consumidos e a média por dia. considere 30 dias.
//9 Faça um programa que peça ao usuário um número inteiro qualquer. Se ele for maior que 10 e menor que 100, calcule a potência dele elevado a 2.
// Se ele for maior que 100 ou menor que 10, exiba a raiz quadrada do valor. Exiba os valores com 5 casas decimais.

import java.util.Scanner;
public class questao2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String nome;
    int idade;
    char genero;
    String cor;
    boolean praticaEsporte;

    System.out.print("Digite seu Nome : ");
    nome= s.next();

    System.out.print("Digite sua idade: ");
    idade = s.nextInt();

    System.out.print("Digite seu gênero (M/F): ");
    genero = s.next().charAt(0);

    System.out.print("Digite sua cor favorita: ");
    cor = s.next();

    System.out.print("Você pratica esporte? (true/false): ");
    praticaEsporte = s.nextBoolean();
    
    System.out.println("\n Informações digitadas:");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Gênero: " + genero);
    System.out.println("Cor favorita: " + cor);
    System.out.println("Pratica esporte: " + praticaEsporte);

}

}