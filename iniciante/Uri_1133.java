package iniciante;

import java.util.Scanner;

public class Uri_1133 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aux;
        int x = scan.nextInt();
        int y = scan.nextInt();
        if(x < 0 || y < 0){
            System.exit(0);
        }
        if(x > y){
            aux = x;
            x = y;
            y = aux;
        }
        for(int i = x + 1; i < y; i++){
            if(i % 5 > 1 & i % 5 < 4){
                System.out.println(i);
            }
        }
    }
}
