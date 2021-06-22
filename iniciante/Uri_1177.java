package iniciante;

import java.util.Scanner;

public class Uri_1177 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < 1000; i++){
            System.out.println("N[" + i + "] = " + i % t);
        }
    }
}
