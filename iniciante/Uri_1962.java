package iniciante;

import java.util.Scanner;

public class Uri_1962 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int anoA = 2015 - 1;
        while(i > 0){
            int ano = scan.nextInt();
            if(ano < 2015){
                System.out.println((anoA - ano)+1 + " D.C.");
            }else{
                System.out.println((anoA - ano)*-1 + " A.C.");
            }
            i--;
        }
    }
}
