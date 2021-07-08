package iniciante;

import java.util.Scanner;

public class Uri_2163 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int p1 = 0, p2 = 0, aux = 0;
        int[][] ma = new int[n][m];
        for(int i = 0; i < ma.length; i++){
            for(int p = 0; p < ma[i].length; p++){
                ma[i][p] = scan.nextInt();
            }
        }
        for(int i = 1; i < ma.length-1; i++){
            for(int p = 1; p < ma[i].length-1; p++){
                if(ma[i][p] == 42){
                    if(ma[i-1][p-1] == 7 & ma[i-1][p] == 7 & ma[i-1][p+1] == 7 &
                    ma[i][p-1] == 7 & ma[i][p+1] == 7 &
                    ma[i+1][p-1] == 7 & ma[i+1][p] == 7 & ma[i+1][p+1] == 7){
                        p1 = i+1;
                        p2 = p+1;
                    }
                }
            }
        }
        System.out.println(p1 + " " + p2);
    }
}
