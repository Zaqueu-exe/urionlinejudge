package iniciante;

import java.util.Scanner;

public class Uri_2807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numeros = new int[n];
        int primeiro = 1;
        int segundo = 1;
        for(int i = 0; i < n; i++){
            numeros[i] = primeiro;
            segundo = segundo + primeiro;
            primeiro = segundo - primeiro;
            
        }
        for(int i = n-1; i > 0; i--){
            System.out.print(numeros[i] + " ");
        }
        System.out.println(numeros[0]);
    }
}
