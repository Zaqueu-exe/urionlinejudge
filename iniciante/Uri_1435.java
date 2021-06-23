package iniciante;

import java.util.Scanner;

public class Uri_1435 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
        while(op != 0){
            int[][] m = new int[op][op];
            int aux = 0, aux1 =  m.length-1, aux2 = 1;
            for(int i = 0; i < (op+1)/2; i++){
                for(int t = aux; t <= aux1; t++){
                    m[t][aux] = aux2;
                    m[aux][t] = aux2;
                    m[t][aux1] = aux2;
                    m[aux1][t] = aux2;
                } 
                aux2++;
                aux++;
                aux1--;
            }
            for(int i = 0; i < m.length; i++){
                for(int t = 0; t < m[i].length; t++){
                    if(t == m.length-1){
                        System.out.printf("%3d\n",  m[i][t]);
                    }else{
                        System.out.printf("%3d ",  m[i][t]);
                    }
                }
            }
            System.out.print("\n");
            op = scan.nextInt();
        }
    }
}
