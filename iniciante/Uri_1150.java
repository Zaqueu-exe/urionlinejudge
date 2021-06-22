package iniciante;

import java.util.Scanner;

public class Uri_1150 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int z = scan.nextInt();
        int soma = 0, aux = 0;
        while(z <= x){
            z = scan.nextInt();
        }
        for(int i = x; i < z; i++){
            soma = i + soma;
            aux++;
            if(soma >= z){
                break;
            }
        }
        System.out.println(aux);
    }
}
