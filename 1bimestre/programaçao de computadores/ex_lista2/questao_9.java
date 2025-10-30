package ex_lista2;

import java.util.Scanner;

public class questao_9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valorCompra = sc.nextDouble();

        System.out.print("Digite o código da condição de pagamento (1 a 4): ");
        int codigo = sc.nextInt();

        double valorFinal = valorCompra;
        int parcelas = 1;

        switch (codigo) {
            case 1:
                valorFinal = valorCompra * 0.90; // 10% desconto
                parcelas = 1;
                break;
            case 2:
                valorFinal = valorCompra * 0.92; // 8% desconto
                parcelas = 2;
                break;
            case 3:
                valorFinal = valorCompra; // sem desconto
                parcelas = 5;
                break;
            case 4:
                valorFinal = valorCompra * 1.05; // acréscimo 5%
                parcelas = 10;
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return;
        }

        double valorParcela = valorFinal / parcelas;

        System.out.println("Valor total a pagar: R$ " + valorFinal);
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor por parcela: R$ " + valorParcela);

        sc.close();
    }
}

