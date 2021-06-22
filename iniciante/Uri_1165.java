package iniciante;

import java.util.Scanner;

public class Uri_1165 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            int soma = 0;
            for(int k = 1; k < x; k++){
                if(x % k == 0){
                    soma++;
                }
            }
            if(soma == 1){
                System.out.println(x + " eh primo");
            }else{
                System.out.println(x + " nao eh primo");
            }
        }
    }
}
