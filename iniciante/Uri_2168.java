package iniciante;

import java.util.Scanner;

public class Uri_2168 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] m = new int[n+1][n+1];
        int aux = 0;
        for(int i = 0; i < m.length; i++){
            for(int y = 0; y < m[i].length; y++){
                m[i][y] = scan.nextInt();
            }
        }
        for(int i = 0; i < m.length-1; i++){
            for(int y = 0; y < m[i].length-1; y++){
                aux = m[i][y] + m[i][y+1] + m[i+1][y] + m[i+1][y+1];
                if(aux >= 2){
                    System.out.print("S");
                }else{
                    System.out.print("U");
                }
            }
            System.out.println();
        }
        
    }
}
