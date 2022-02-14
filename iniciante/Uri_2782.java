package iniciante;

import java.util.Scanner;

public class Uri_2782 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numeros = new int[n];
        for(int i = 0; i < n; i++){
            numeros[i] = scan.nextInt();
        }
        System.out.println(totalDeEscada(numeros));
        scan.close();
    }
    public static int totalDeEscada(int[] vetor){
        if(vetor.length <= 2){
            return 1;
        }
        int anterior = vetor[0] - vetor[1];
        int total = 1;
        for(int i = 2; i < vetor.length; i++){
            int atual = vetor[i-1] - vetor[i];
            if(atual != anterior){
                anterior = atual;
                total++;
            }
        }
        return total;
    }
}
