package iniciante;

import java.util.Scanner;

public class Uri_1047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h, hf, m, mf, t, ht = 0;
        h = scan.nextInt();
        m = scan.nextInt();
        hf = scan.nextInt();
        mf = scan.nextInt();
        if(h == hf & m >= mf || h > hf){
            hf = hf + 24;
        }
        h = (h*60)+m;
        hf = (hf*60)+mf;
        if(h > hf){
            t = h - hf;
        }else{
            t = hf - h;
        }
        if(!(t > 0 & t <= 1440)){
            System.exit(0);
        }
        while(t >= 60){
            t = t - 60;
            ht++;
        }
            System.out.println("O JOGO DUROU " + ht + " HORA(S) E " + t + " MINUTO(S)");

    }
}
