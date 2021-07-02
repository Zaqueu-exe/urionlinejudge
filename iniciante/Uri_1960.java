package iniciante;

import java.util.Scanner;

public class Uri_1960 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] r = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] v = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int cont = 0;
        while(n > 0){
            if(n - v[cont] >= 0){
                n = n - v[cont];
                System.out.print(r[cont]);
            }else{
                cont++;
            }
        }
        System.out.println();
    }
}
