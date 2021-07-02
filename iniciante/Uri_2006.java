package iniciante;

import java.util.Scanner;

public class Uri_2006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int cont = 0;
        for(int i = 0; i < 5; i++){
            int p = scan.nextInt();
            if(t == p){
                cont++;
            }
        }
        System.out.println(cont);
    }
}
