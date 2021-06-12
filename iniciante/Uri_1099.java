package iniciante;

import java.util.Scanner;

public class Uri_1099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos;
        int num1, num2;
        int[] soma;
        casos = scan.nextInt();
        soma = new int[casos];
        for(int i = 0; i < casos; i++){
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            int aux;
            if(num1 > num2){
                aux = num2;
                num2 = num1;
                num1 = aux;
            }
            for(int p = (num1 + 1); p < num2; p++){
                if(p % 2 == 1){
                    soma[i] = soma[i] + p;
                }
            }
        }
        for(int i = 0; i < soma.length; i++){
            System.out.println(soma[i]);
        }
    }
}
