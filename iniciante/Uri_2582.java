package iniciante;

import java.util.Scanner;

public class Uri_2582 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if(x + y == 0){
                System.out.println("PROXYCITY");
            }else if(x + y == 1){
                System.out.println("P.Y.N.G.");
            }else if(x + y == 2){
                System.out.println("DNSUEY!");
            }else if(x + y == 3){
                System.out.println("SERVERS");
            }else if(x + y == 4){
                System.out.println("HOST!");
            }else if(x + y == 5){
                System.out.println("CRIPTONIZE");
            }else if(x + y == 6){
                System.out.println("OFFLINE DAY");
            }else if(x + y == 7){
                System.out.println("SALT");
            }else if(x + y == 8){
                System.out.println("ANSWER!");
            }else if(x + y == 9){
                System.out.println("RAR?");
            }else if(x + y == 10){
                System.out.println("WIFI ANTENNAS");
            }
        }
    }
}
