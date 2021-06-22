package iniciante;

import java.util.Scanner;

public class Uri_1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int soma;
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            soma = 0;
            for(int p = x; p < (x+(y*2)); p++){
                if(p % 2 != 0){
                    soma += p;
                }
            }
            System.out.println(soma);
        }
    }
}
