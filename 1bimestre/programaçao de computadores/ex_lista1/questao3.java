import java.util.Scanner;

class questao3 {
public static void main(String[] args) {
    int a ;
    int b ;
    
    int soma;
    int subitraçao;
    int multiplicacao;
    double divisao;
    double resto_divisao;

    Scanner s = new Scanner(System.in);//variavel para ler informaçoes do terminal (entrada de dados)
    System.out.print("Digite o valor de A: ");
    a = s.nextInt();
    System.out.print("Digite o valor de B: ");
    b = s.nextInt();

    soma = a + b;
    subitraçao = a - b;
    multiplicacao = a * b;
    divisao = (double) a / b;
    resto_divisao = a % b;

    System.out.println("A soma de " + a + " e " + b + " é " + soma);
    System.out.println("A subtração de " + a + " e " + b + " é " + subitraçao);
    System.out.println("A multiplicação de " + a + " e " + b + " é " + multiplicacao);
    System.out.println("A divisão de " + a + " e " + b + " é " + divisao);
    System.out.println("O resto da divisão de " + a + " e " + b + " é " + resto_divisao);

    

}}