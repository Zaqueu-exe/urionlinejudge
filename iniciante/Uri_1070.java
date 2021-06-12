package iniciante;

import java.util.Scanner;

public class Uri_1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        for(int i = n; i < (n+12); i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
