package iniciante;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Uri_2812 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int g = 0; g < n; g++){
            int total = scan.nextInt();
            LinkedList<Integer> numeros = new LinkedList<>();
            for(int i = 0; i < total; i++){
                int aux = scan.nextInt();
                if(aux % 2 == 1){
                    numeros.add(aux);
                }
            }
            Collections.sort(numeros);
            int[] numeros1 = new int[numeros.size()];
            int aux = 0;
            while(numeros.size() > 1){
                numeros1[aux] = numeros.removeLast();
                aux++;
                numeros1[aux] = numeros.removeFirst();
                aux++;
            }
            if(numeros.size() == 1){
                numeros1[aux] = numeros.removeFirst();
            }
            for(int i = 0; i < numeros1.length-1; i++){
                System.out.print(numeros1[i] + " ");
            }
            if(numeros1.length >= 1){
                System.out.println(numeros1[numeros1.length-1]);
            }else{
                System.out.println();
            }
        }
    }
}
