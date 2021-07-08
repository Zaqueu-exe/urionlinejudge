package iniciante;

import java.util.Scanner;

public class Uri_2203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xf = 0;
        while(scan.hasNext()){
            try{
                xf = scan.nextInt();
            }catch(Exception e){
                System.exit(0);
            }
            int yf = scan.nextInt();
            int xi = scan.nextInt();
            int yi = scan.nextInt();
            int vi = scan.nextInt();
            int r1 = scan.nextInt();
            int r2 = scan.nextInt();
            double aux = Math.sqrt(Math.pow(xi - xf, 2.0) + Math.pow(yi - yf, 2.0)) + (vi * 1.50);
            double aux1 = r1 +r2;
            if(aux > aux1){
                System.out.println("N");
            }else{
                System.out.println("Y");
            }
        }
    }
}
