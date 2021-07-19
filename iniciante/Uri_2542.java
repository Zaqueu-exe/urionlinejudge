package iniciante;

import java.util.Scanner;

public class Uri_2542 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int m = scan.nextInt();
            long[][] marcos = new long[m][n];
            int l = scan.nextInt();
            long[][] leo = new long[l][n];
            for(int i = 0; i < marcos.length; i++){
                for(int t = 0; t < marcos[i].length; t++){
                    marcos[i][t] = scan.nextLong();
                }
            }
            for(int i = 0; i < leo.length; i++){
                for(int t = 0; t < leo[i].length; t++){
                    leo[i][t] = scan.nextLong();
                }
            }
            int am = scan.nextInt();
            int al = scan.nextInt();
            int as = scan.nextInt();

            if(marcos[am-1][as-1] > leo[al-1][as-1]){
                System.out.println("Marcos");
            }else if(marcos[am-1][as-1] < leo[al-1][as-1]){
                System.out.println("Leonardo");
            }else{
                System.out.println("Empate");
            }
        }
    }
}
