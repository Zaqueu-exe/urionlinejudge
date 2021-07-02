package iniciante;

import java.util.Scanner;

public class Uri_1957 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] h = new int[10];
        int i = 0;
        boolean t = false;
        while(!t){
            if(n > 15){
                h[i] = n%16;
                n = n / 16;
                i++;
            }else{
                h[i] = n;
                t = true;
            }
        }
        String[] he = new String[10];
        for(int p = 0; p <= i; p++){
            if(h[p] == 15){
                he[p] = "F";
            }else if(h[p] == 14){
                he[p] = "E";
            }else if(h[p] == 13){
                he[p] = "D";
            }else if(h[p] == 12){
                he[p] = "C";
            }else if(h[p] == 11){
                he[p] = "B";
            }else if(h[p] == 10){
                he[p] = "A";
            }else{
                he[p] = Integer.toString(h[p]);
            }
        }
        for(i = he.length-1; i > -1; i--){
            if(he[i] != null){
                System.out.print(he[i]);
            }
        }
        System.out.println();
    }
}
