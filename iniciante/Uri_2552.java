package iniciante;

import java.util.Scanner;

public class Uri_2552 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] v = new int[n][m];
            int cont = 0;
            for(int i = 0; i < v.length; i++){
                for(int p = 0; p < v[i].length; p++){
                    v[i][p] = scan.nextInt();
                    if(v[i][p] == 1){
                        v[i][p] = 9;
                    }
                }
            }
            for(int i = 0; i < v.length; i++){
                for(int p = 0; p < v[i].length; p++){
                    if(v[i][p] == 0){
                        if((i+1 < n) && (v[i+1][p] == 9)){
                            cont++;
                        }
                        if(i-1 >= 0 && v[i-1][p] == 9){
                            cont++;
                        }
                        if((p+1 < m) && (v[i][p+1] == 9)){
                            cont++;
                        }
                        if(p-1 >= 0 && v[i][p-1] == 9){
                            cont++;
                        }
                        v[i][p] = cont;
                    }
                    cont = 0;
                }
            }
            for(int i = 0; i < v.length; i++){
                for(int p = 0; p < v[i].length; p++){
                    System.out.print(v[i][p]);
                }
                System.out.println();
            }
        }
    }
}
