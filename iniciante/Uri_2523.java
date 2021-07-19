package iniciante;

import java.util.Scanner;

public class Uri_2523 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String[] letras = scan.next().split("");
            int n = scan.nextInt();
            String palavra = "";
            for(int i = 0; i < n; i++){
                palavra = palavra + letras[scan.nextInt()-1];
            }
            System.out.println(palavra);
        }
    }
}
