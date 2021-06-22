package iniciante;

import java.util.Scanner;

public class Uri_1149 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        int soma = 0;
        while(n < 1){
            n = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            soma = soma + (a+i);
        }
        System.out.println(soma);
    }
}
