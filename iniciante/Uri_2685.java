package iniciante;

import java.util.Scanner;

public class Uri_2685 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int m =scan.nextInt();
            if(m >= 0 && m < 90 || m == 360){
                System.out.println("Bom Dia!!");
            }else if(m >= 90 && m < 180){
                System.out.println("Boa Tarde!!");
            }else if(m >= 180 && m < 270){
                System.out.println("Boa Noite!!");
            }else if(m >= 270 && m < 360){
                System.out.println("De Madrugada!!");
            }
        }
    }
}
