package iniciante;

import java.util.Scanner;

public class Uri_1175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[20];
        for(int i = n.length - 1; i > -1; i--){
            n[i] = scan.nextInt();
        }
        for(int i = 0; i < n.length; i++){
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
