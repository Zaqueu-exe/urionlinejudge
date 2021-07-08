package iniciante;

import java.util.Scanner;

public class Uri_2221 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t > 0){
            t--;
            Double b = scan.nextDouble();

            double a1 = scan.nextDouble();
            double d1 = scan.nextDouble();
            double l1 = scan.nextDouble();
            
            double a2 = scan.nextDouble();
            double d2 = scan.nextDouble();
            double l2 = scan.nextDouble();

            Double vg1 = (a1+d1)/2.0;
            Double vg2 = (a2+d2)/2.0;

            if(l1 % 2 == 0){
                vg1 += b;
            }
            if(l2 % 2 == 0){
                vg2 += b;
            }
            if(vg1 > vg2){
                System.out.println("Dabriel");
            }else if(vg1 < vg2){
                System.out.println("Guarte");
            }else{
                System.out.println("Empate");
            }
        }
    }
}
