//Faça um algoritmo para calcular o volume de uma esfera de raio R,
// em que R é fornecido pelo usuário. o volume de uma esfera é dado por:  V = 4/3 π r³

package ex_lista2;

import java.util.Scanner;

public class questao_1 {

    public static void main(String[] args) {

        double R, volume;
        Scanner s = new Scanner (System.in);
        
        System.out.println("informe o valor do raio");
        R = s.nextDouble();

        volume = 4.0/3.0 * Math.PI * Math.pow(R,3);

        System.out.println("volume da esfera informada e :"+ volume );

        //System.out.printlf ( "o volume da esfera infomada %.2f%n",volume);


    }
    
}
