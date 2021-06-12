package iniciante;

import java.util.Scanner;

public class Uri_1071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, aux;
        n1 = scan.nextInt();
        n2 = scan.nextInt();

        if(n1 > n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        aux = 0;
        while(n1 < (n2 - 1)){
            n1 = n1 + 1;

            if(n1 % 2 == -1 || n1 % 2 == 1){
                aux = aux + n1;
            }
        }
        System.out.println(aux);
    }
}
