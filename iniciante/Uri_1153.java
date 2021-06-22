package iniciante;

import java.util.Scanner;

public class Uri_1153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = 1;
        if(!(x > 0 & x < 13)){
            System.exit(0);
        }
        for(int i = 1; i < x; i++){
            n = n + (n * (x -i));
        }
        System.out.println(n);
    }
}
