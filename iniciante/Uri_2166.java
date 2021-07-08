package iniciante;

import java.util.Scanner;

public class Uri_2166 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        double i = 0.0;
        int aux = 1;
        while(n > 0){
            i += 2.0;
            i = 1.0/i;
            n--;
        }
        i +=1.0;
        System.out.printf("%.10f\n", i);
    }
}
