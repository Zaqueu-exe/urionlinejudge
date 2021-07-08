package iniciante;

import java.util.Scanner;

public class Uri_2162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int aux = 1;
        int[] v = new int[n];
        for(int i = 0; i < v.length; i++){
            v[i] = scan.nextInt();
        }
        if(v.length == 1){
            aux = 0;
        }else if(v.length == 2){
            if(v[0] == v[1]){
                aux = 0;
            }
        }else{
            for(int i = 2; i < v.length; i++){
                if((v[i-2] > v[i-1] & v[i-1] < v[i]) || (v[i-2] < v[i-1] & v[i-1] > v[i])){
                }else{
                    aux = 0;
                    break;
                }
            }
        }
        System.out.println(aux);
    }
}
