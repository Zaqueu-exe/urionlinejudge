package iniciante;

import java.util.Scanner;

public class Uri_1066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, pa = 0, im = 0, po = 0, ne = 0;
        for(int i = 0; i < 5; i++){
            n = scan.nextInt();
            if(n < 0){
                ne++;
            }else if(n > 0){
                po++;
            }
            if(n % 2 == 0){
                pa++;
            }else{
                im++;
            }
        }
        System.out.println(pa + " valor(es) par(es)");
        System.out.println(im + " valor(es) impar(es)");
        System.out.println(po + " valor(es) positivo(s)");
        System.out.println(ne + " valor(es) negativo(s)");
    }
}
