package iniciante;

import java.util.Scanner;

public class Uri_1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        if(n > 0 & n <= 1000){
            for(int i = 0; i <= n; i++){
                if(i % 2 == 1){
                    System.out.println(i);
                }
            }
        }
    }
}
