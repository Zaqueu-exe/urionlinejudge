package iniciante;

import java.util.Scanner;

public class Uri_1078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        numero = scan.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }
    }
}
