package iniciante;

import java.util.Scanner;

public class Uri_1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, p = 0;
        for(int i = 0; i < 5; i++){
            n = scan.nextInt();
            if(n % 2 == 0){
                p++; 
            }
        }
        System.out.println(p + " valores pares");
    }
}
