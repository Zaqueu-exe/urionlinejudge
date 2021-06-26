package iniciante;

import java.util.Scanner;

public class Uri_1858 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];
        int p = 0, m = 10000000;
        for(int i = 0; i < v.length; i++){
            v[i] = scan.nextInt();
            if(v[i] < m){
                m = v[i];
                p = i;
            }
        }
        System.out.println(p+1);
    }
}
