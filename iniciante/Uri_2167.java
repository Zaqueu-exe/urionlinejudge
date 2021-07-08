package iniciante;

import java.util.Scanner;

public class Uri_2167 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] r = new int[n];
        int p = 0;
        boolean aux = true;
        for(int i = 0; i < r.length; i++){
            r[i] = scan.nextInt();
            if(i > 0 & aux){
                if(r[i-1] > r[i]){
                    aux = false;
                    p = i + 1;
                }
            }
        }
        System.out.println(p);
    }
}
