package iniciante;

import java.util.Scanner;

public class Uri_2143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t !=0){
            for(int i = 1; i <= t; i++){
                int m = scan.nextInt();
                if(m % 2 == 1){
                    System.out.println(m*2-1);
                }else{
                    System.out.println(m*2-2);
                }
            }
            t = scan.nextInt();
        }
    }
}
