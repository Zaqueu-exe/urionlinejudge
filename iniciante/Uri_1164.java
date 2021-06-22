package iniciante;

import java.util.Scanner;

public class Uri_1164 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            int soma = 0;
            for(int p = 1; p < x; p++){
                if(x % p == 0){
                    soma += p;
                }
            }
            if(soma == x){   
                System.out.println(x + " eh perfeito");
            }else{
                System.out.println(x + " nao eh perfeito");
            }
        }
    }
}
