package iniciante;

import java.util.Scanner;

public class Uri_2630 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            int[] v = new int[t];
            int aux = 0;
            String p = scan.next();
            int r = scan.nextInt();
            int g = scan.nextInt();
            int b = scan.nextInt();
            
            if(p.equals("min")){
                if(r < b){
                    b = r;
                }if(b < g){
                    g = b;
                }
                System.out.println("Caso #" + (i+1) +": " + g);
            }else if(p.equals("mean")){
                System.out.println("Caso #" + (i+1) +": " + (r+b+g)/3);
            }else if(p.equals("eye")){
                int n = (int)((r*0.30)+(g*0.59)+(b*0.11));
                System.out.println("Caso #"+ (i+1) +": " + n);
            }else if(p.equals("max")){
                if(r > b){
                    b = r;
                }if(b > g){
                    g = b;
                }
                System.out.println("Caso #" + (i+1) +": " + g);
            }
        }
    }
}
