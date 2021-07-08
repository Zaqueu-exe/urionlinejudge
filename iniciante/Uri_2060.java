package iniciante;

import java.util.Scanner;

public class Uri_2060{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] v = new int[n];
        int m2 = 0, m3 = 0, m4 = 0, m5 = 0;
        for(int i = 0; i < v.length; i++){
            v[i] = scan.nextInt();
            if(v[i] % 2 == 0){
                m2++;
            }if(v[i] % 3 == 0){
                m3++;
            }if(v[i] % 4 == 0){
                m4++;
            }if(v[i] % 5 == 0){
                m5++;
            }
        }
        System.out.println(m2 + " Multiplo(s) de 2");
        System.out.println(m3 + " Multiplo(s) de 3");
        System.out.println(m4 + " Multiplo(s) de 4");
        System.out.println(m5 + " Multiplo(s) de 5");
    }
}