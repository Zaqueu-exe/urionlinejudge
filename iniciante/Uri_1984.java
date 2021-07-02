package iniciante;

import java.util.Scanner;

public class Uri_1984 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numero = scan.next();
        String[] n = numero.split("");
        for(int i = n.length-1; i >= 0; i--){
            System.out.print(n[i]);
        }
        System.out.println();
    }
}
