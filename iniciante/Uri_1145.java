package iniciante;

import java.util.Scanner;

public class Uri_1145{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(!(x > 0 & x < 20 || y > x & y < 100000)){
            System.exit(0);
        }
        for(int i = 1; i <= y; i++){
            if(i % x == 0){
                System.out.print(i);
                System.out.print("\n");
                continue;
            }
            System.out.print(i + " ");
        }

    }
}