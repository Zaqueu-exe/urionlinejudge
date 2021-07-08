package iniciante;

import java.util.Scanner;

public class Uri_2140 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int t = m - n;
        int[] notas = {2, 5, 10, 20, 50, 100};
        do{
            int cont = 0;
            for(int i = 0; i < 2; i++){
                for(int p = notas.length-1; p >= 0; p--){
                    if(t - notas[p] >= 0){
                        t = t - notas[p];
                        cont++;
                        if(t - notas[p] == 0){
                            t = t - notas[p];
                            cont++;
                            break;
                        }
                    }
                }
            }
            if(cont == 2){
                System.out.println("possible");
            }else{
                System.out.println("impossible");
            }
            n = scan.nextInt();
            m = scan.nextInt();
            t = m - n;
        }while(m != 0 & n != 0);
    }
}
