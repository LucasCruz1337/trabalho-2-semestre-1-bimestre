import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a leitura do relógio no dia 1º (em m³): ");
        int leituraInicial = s.nextInt();

        System.out.print("Informe a leitura do relógio no dia 30º (em m³): ");
        int leituraFinal = s.nextInt();

        int consumoM3 = leituraFinal - leituraInicial;   // consumo em m³
        int consumoLitros = consumoM3 * 1000;            // conversão para litros
        double mediaDia = consumoLitros / 30.0;          // média por dia

        System.out.println("Consumo total: " + consumoLitros + " litros");
        System.out.println("Média diária: " + mediaDia + " litros/dia");

        s.close();
    }
}
