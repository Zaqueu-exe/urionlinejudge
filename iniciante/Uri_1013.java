package iniciante;

import java.util.Scanner;

public class Uri_1013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aux;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(c > b){
            aux = b;
            b = c;
            c = aux;
        }if(b > a){
            aux = a;
            a = b;
            b = aux;
        }
        System.out.println(a);
    }
}
