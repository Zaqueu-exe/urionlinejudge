package iniciante;

import java.util.Scanner;

public class Uri_2686 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double m = scan.nextDouble();
            int h = 6, mi;
            double aux = m*4.0;
            if(aux >= 60.0){
                h = h + (int) (aux / 60.0);
            }
            mi = (int) (aux%60.0);
            if(m >= 0 && m < 90.0){
                System.out.println("Bom Dia!!");
                System.out.printf("%02d:%02d:00%n",h, mi);
            }else if(m >= 90 && m < 180.0){
                System.out.println("Boa Tarde!!");
                System.out.printf("%02d:%02d:00%n",h, mi);
            }else if(m >= 180 && m < 270.0){
                System.out.println("Boa Noite!!");
                System.out.printf("%02d:%02d:00%n",h, mi);
            }else if(m >= 270 && m < 360.0){
                System.out.println("De Madrugada!!");
                System.out.printf("%02d:%02d:00%n",h-24, mi);
            }else if(m == 360.0){
                System.out.println("Bom Dia!!");
                System.out.printf("%02d:%02d:00%n",h-24, mi);
            }
        }
    }
}
