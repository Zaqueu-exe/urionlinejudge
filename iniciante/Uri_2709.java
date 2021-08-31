package iniciante;

import java.util.Scanner;

public class Uri_2709 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int m = scan.nextInt();
            int[] v = new int[m];
            int valor = 0, cont = m, tst = 0;
            for(int i = 0; i < v.length; i++){
                v[i] = scan.nextInt();
            }
            int salto = scan.nextInt();
            while(cont > 0){
                valor = valor + v[cont-1];
                cont -= salto;
            }
            for(int i = 1; i < valor; i++){
                if(valor%i == 0){
                    tst++;
                }
            }
            if(tst == 1){
                System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            }else{
                System.out.println("Bad boy! I’ll hit you.");
            }
        }
    }
}
