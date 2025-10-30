import java.util.Scanner; 
import java.util.Random;
import java.util.Arrays;

public class lista1bim_Lucas_Eduardo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int exercicio;

        do {
            System.out.print("Informe qual o exercício deseja executar (0 para sair): ");
            exercicio = s.nextInt();

            switch (exercicio) {
                case 1: ex_01(); break;
                case 2: ex_02(); break;
                case 3: ex_03(); break;
                case 4: ex_04(); break;
                case 5: ex_05(); break;
                case 6: ex_06(); break;
                case 7: ex_07(); break;
                case 8: ex_08(); break;
                case 9: ex_09(); break;
                case 10: ex_10(); break;
                case 11: ex_11(); break;
                case 12: ex_12(); break;
                case 13: ex_13(); break;
                case 14: ex_14(); break;
                case 15: ex_15(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (exercicio != 0);

        s.close();
    }

    public static void ex_01(){
        /*Faça um programa que peça dois números inteiros ao usuário. 
        Depois exiba se o primeiro é maior, menor ou igual ao segundo.*/
        
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt(); 
        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt(); 

        if (n1 > n2) { 
            System.out.println(n1 + " é maior que " + n2);
        } else if (n1 < n2) { 
            System.out.println(n1 + " é menor que " + n2);
        } else { 
            System.out.println("Os números são iguais.");
        }
    }

    public static void ex_02(){
        /*Faça um programa que peça um número ao usuário. Exiba se esse número é Par ou Ímpar 
        (use o operador de resto da divisão - mod %).  */
        
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite um número: ");
        int n = s.nextInt(); 

        if (n % 2 == 0) { 
            System.out.println(n + " é Par.");
        } else { 
            System.out.println(n + " é Ímpar.");
        }
    }

    public static void ex_03(){
        /*Faça um programa que peça ao usuário o valor do relógio de água de uma residência no dia 1º 
        do mês e no dia 30º do mesmo mês. Depois mostre quantos litros foram consumidos e a média por dia. considere 30 dias. */
        
        Scanner s = new Scanner(System.in); 
        System.out.print("Informe a leitura do hidrômetro no dia 1: ");
        int inicio = s.nextInt(); 
        System.out.print("Informe a leitura do hidrômetro no dia 30: ");
        int fim = s.nextInt(); 

        int consumo = fim - inicio; 
        double media = consumo / 30.0; 

        System.out.println("Consumo total: " + consumo + " litros.");
        System.out.println("Média por dia: " + media + " litros.");
    }

    public static void ex_04(){
        /*Faça um programa que peça ao usuário um número inteiro qualquer. Se ele for maior que 10 e menor que 100,
         calcule a potência dele elevado a 2. Se ele for maior que 100 ou menor que 10, exiba a raiz quadrada do valor. 
         Exiba os valores com 5 casas decimais.*/
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();

        if (n > 10 && n < 100) {
            double pot = Math.pow(n, 2);
            System.out.printf("Número ao quadrado: %.5f%n", pot);
        } else {
            double raiz = Math.sqrt(n);
            System.out.printf("Raiz quadrada: %.5f%n", raiz);
        }
    }

    public static void ex_05(){
    /* Dado os três valores, A, B e C, verificar se eles podem ser os comprimentos dos lados de um triângulo, 
    se forem, verificar se compõem um triângulo equilátero, isósceles ou escaleno. */
    
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o lado A: ");
        int a = s.nextInt();
        System.out.print("Digite o lado B: ");
        int b = s.nextInt();
        System.out.print("Digite o lado C: ");
        int c = s.nextInt();

        if (a < b + c && b < a + c && c < a + b) { 
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não compõem um triângulo");
        }
    }

    public static void ex_06(){
    /* Tendo como dados de entrada a altura, o peso e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal */
    
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a altura (m): ");
        double h = s.nextDouble();
        System.out.print("Digite o peso: ");
        double peso = s.nextDouble();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = s.next().toUpperCase().charAt(0);

        double pesoIdeal;
        if (sexo == 'M') {
            pesoIdeal = (72.7 * h) - 58;
        } else {
            pesoIdeal = (62.1 * h) - 44.7;
        }

        System.out.printf("Peso ideal: %.2f%n", pesoIdeal);

        if (peso < pesoIdeal) {
            System.out.println("Abaixo do peso ideal");
        } else if (peso > pesoIdeal) {
            System.out.println("Acima do peso ideal");
        } else {
            System.out.println("No peso ideal");
        }
    }

    public static void ex_07(){
        /*Verificar idade para votar e habilitação */
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int ano = s.nextInt();

        int idade = 2025 - ano; 

        if (idade >= 18) {
            System.out.println("Pode votar e tirar habilitação.");
        } else if (idade >= 16) {
            System.out.println("Pode votar, mas não pode tirar habilitação.");
        } else {
            System.out.println("Não pode nem votar nem tirar carteira.");
        }
    }

    public static void ex_08(){
        /*Classificação de nadador por idade*/
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        int idade = s.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Sem categoria.");
        }
    }

    public static void ex_09(){
        /* Soma de números pares até o usuário digitar zero */
        
        Scanner s = new Scanner(System.in);
        int soma = 0, num;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = s.nextInt();
            if (num % 2 == 0) {
                soma += num;
            }
        } while (num != 0);

        System.out.println("Soma dos números pares: " + soma);
    }

    public static void ex_10(){
        /* Jogo de adivinhar número */
        
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int sorteado = rand.nextInt(100) + 1; 
        int chute;

        do {
            System.out.print("Digite seu chute (1-100): ");
            chute = s.nextInt();

            if (chute > sorteado) {
                System.out.println("Muito alto!");
            } else if (chute < sorteado) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Acertou!");
            }
        } while (chute != sorteado);
    }

    public static void ex_11(){
        /* Sorteio entre 10 e 29 */
        
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int num;

        do {
            System.out.print("Digite um número entre 10 e 29 (ou 9 para sair): ");
            num = s.nextInt();
            if (num == 9) break;

            int sorteado = rand.nextInt(20) + 10; 
            if (num == sorteado) {
                System.out.println("PARABÉNS! Você acertou!");
            } else {
                System.out.println("QUE PENA. Não foi desta vez. Tente novamente!");
            }
        } while (num != 9);
    }

    public static void ex_12(){
        /*Ordenar números em ordem crescente ou decrescente*/
        
        Scanner s = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            nums[i] = s.nextInt();
        }

        System.out.print("Digite 1 para crescente ou 2 para decrescente: ");
        int opcao = s.nextInt();

        Arrays.sort(nums); 

        if (opcao == 1) {
            System.out.println("Ordem crescente: " + Arrays.toString(nums));
        } else {
            System.out.print("Ordem decrescente: [");
            for (int i = nums.length-1; i >= 0; i--) {
                System.out.print(nums[i] + (i>0 ? ", " : ""));
            }
            System.out.println("]");
        }
    }

    public static void ex_13(){
        /* Contar vogais e consoantes */
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = s.nextLine().toLowerCase();

        int vogais = 0, consoantes = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == ' ') continue;
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            } else if (Character.isLetter(c)) {
                consoantes++;
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }

    public static void ex_14(){
        /* Validador de senha */
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = s.nextLine();
        System.out.print("Digite a senha: ");
        String senha = s.nextLine();

        boolean ok = true;

        if (senha.length() < 8) ok = false;
        if (!(senha.contains("@") || senha.contains("!") || senha.contains("#"))) ok = false;
        if (senha.charAt(0) == nome.charAt(0) || senha.charAt(0) == sobrenome.charAt(0)) ok = false;
        if (senha.toLowerCase().contains(nome.toLowerCase()) || senha.toLowerCase().contains(sobrenome.toLowerCase())) ok = false;

        if (ok) {
            System.out.println("Atende critérios");
        } else {
            System.out.println("Não atende critérios");
        }
    }

    public static void ex_15(){
        /* Função cálculo */
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = s.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = s.nextDouble();

        double resultado = calculo(n1, n2);

        if (n1 > n2) {
            System.out.println("Condição: num1 > num2. Resultado (multiplicação): " + resultado);
        } else if (n1 < n2) {
            System.out.println("Condição: num1 < num2. Resultado (divisão): " + resultado);
        } else {
            System.out.println("Condição: num1 == num2. Resultado (soma): " + resultado);
        }
    }

    public static double calculo(double num1, double num2){
        if (num1 > num2) {
            return num1 * num2;
        } else if (num1 < num2) {
            return num1 / num2;
        } else {
            return num1 + num2;
        }
    }
}
