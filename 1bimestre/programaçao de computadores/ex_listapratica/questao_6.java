package ex_listapratica;

public class questao_6 {
     public static void main(String[] args) {
        for (int min = 10; min >= 0; min--) {
            for (int seg = 59; seg >= 0; seg--) {
                if (min == 10 && seg == 59) seg = 0; // começa em 10:00 certinho
                System.out.printf("%02d:%02d\n", min, seg);
            }
        }
    }
}
