package iniciante;

import java.util.Scanner;

public class Bee_2770 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int m = scan.nextInt();
            for(int i = 0; i < m; i++){
                int x1 = scan.nextInt();
                int y1 = scan.nextInt();

                if((x >= x1) && (y >= y1) || (x >= y1) && (y >= x1)){
                    System.out.println("Sim");
                }else{
                    System.out.println("Nao");
                }
                
            }
        }
    }
}
