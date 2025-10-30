import java.util.Scanner;

class exemplo_operadores {
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
    
    System.out.println("\n resultados das operaços ralacionadas entra A e B " );
    System.out.println("A: " + a + "\nB: " + b);
    System.out.println("A é maior que B? " + (a > b));
    System.out.println("A é menor que B? " + (a < b));
    System.out.println("A é igual a B? " + (a == b));
    System.out.println("A é diferente de B? " + (a != b));
    System.out.println("A é maior ou igual a B? " + (a >= b));
    System.out.println("A é menor ou igual a B? " + (a <= b));


    //criar as variaves para cada tipo primitivo ,peça ao usuario os valores ,armazene nas variaves e depois 
    //mostre na tela os valores inforados pelo usuario 
    int ex_inteiro;
    char ex_char;

    System.out.print("Digite um valor inteiro: ");
    ex_inteiro = s.nextInt();
    System.out.print("Digite um valor caractere: ");
    ex_char = s.next().charAt(0);

    
}
}
