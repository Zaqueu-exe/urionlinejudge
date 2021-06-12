package iniciante;

import java.util.Scanner;

public class Uri_1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dias = scan.nextInt();
        int mes = 0, ano = 0;
    
        while(dias > 365){
            ano++;
            dias = dias - 365;
        }
        while(dias > 30){
            mes++;
            dias = dias - 30;
        }
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
