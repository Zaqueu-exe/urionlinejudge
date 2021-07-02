package iniciante;

import java.util.Scanner;

public class Uri_1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] v = new int[4];
        v[0] = scan.nextInt();
        v[1] = scan.nextInt();
        v[2] = scan.nextInt();
        v[3] = scan.nextInt();
        for(int i = 0; i < v.length; i++){
            for(int p = v.length-1; p > 0; p--){
                int aux;
                if(v[p] > v[p-1]){
                    aux = v[p];
                    v[p] = v[p - 1];
                    v[p - 1] = aux;
                }
            }
        }
        if(!((v[0] >= (v[1] + v[2])))){
            System.out.println("S");
        }else if(!((v[1] >= (v[2] + v[3])))){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
