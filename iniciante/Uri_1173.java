package iniciante;

import java.util.Scanner;

public class Uri_1173 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[] n = new int[10];
        for(int i = 0; i < n.length; i++){
            n[i] = x;
            x *= 2;
        }
        for(int i = 0; i < n.length; i++){
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
