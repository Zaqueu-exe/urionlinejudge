package iniciante;

import java.util.Scanner;

public class Uri_2702 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] o = new int[3];
        int[] p = new int[3];
        int qtd = 0;
        o[0] = scan.nextInt();
        o[1] = scan.nextInt();
        o[2] = scan.nextInt();
        p[0] = scan.nextInt();
        p[1] = scan.nextInt();
        p[2] = scan.nextInt();  
        for(int  i = 0; i < 3; i++){
            if(p[i] > o[i]){
                qtd = qtd + p[i]-o[i];
            }
        }
        System.out.println(qtd);
    }
}
