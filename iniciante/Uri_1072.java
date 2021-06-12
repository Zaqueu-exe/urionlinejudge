package iniciante;

import java.util.Scanner;

public class Uri_1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd, in = 0 ,out = 0;
        int[] n;
        qtd = scan.nextInt();
        n = new int[qtd];
        for(int i = 0; i < n.length; i++){
            n[i] = scan.nextInt();
            if(n[i] >= 10 & n[i] <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
