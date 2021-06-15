package iniciante;

import java.util.Scanner;

public class Uri_1143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n < 0 || n > 1000){
            System.exit(0);
        }
        for(int i = 1; i <= n; i++){
            System.out.println(i + " " + i*i + " " + i*i*i);
        }
    }
}
