package iniciante;

import java.util.Scanner;

public class Uri_1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        numero = scan.nextInt();
        for(int i = 1; i < 10000; i++){
            if(i % numero == 2){
                System.out.println(i);
            }
        }
    }
}
