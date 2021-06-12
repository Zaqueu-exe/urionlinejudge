package iniciante;

import java.util.Scanner;

public class Uri_1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[100];
        int maior = 0, posicao = 0;
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scan.nextInt();
            if(numeros[i] > maior){
                maior = numeros[i];
                posicao = i + 1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
