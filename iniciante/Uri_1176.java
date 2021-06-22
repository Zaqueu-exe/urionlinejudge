package iniciante;

import java.util.Scanner;

public class Uri_1176 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i = 0; i < x; i++){
            int fib = scan.nextInt();
            long p = 1;
            long a = 0;
            long aux = 0;
            int cont = 0;
            while(cont < fib){
                aux = p + a;
                a = p;
                p = aux;
                cont++;
            }
            System.out.println("Fib(" + fib + ") = " + a);
        }
    }
}
