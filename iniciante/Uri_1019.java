package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1019 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int segundos = scan.nextInt();
        int hora = 0, minuto = 0;
        if(segundos > 60){
            while(segundos > 60){
                segundos = segundos - 60;
                minuto++;
            }
        }if(minuto > 60){
            while(minuto > 60){
                minuto = minuto - 60;
                hora++;
            }
        }
        System.out.println(hora+":"+ minuto+":"+ segundos);
    }
}
