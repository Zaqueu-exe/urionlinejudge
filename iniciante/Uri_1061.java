package iniciante;

import java.util.Scanner;

public class Uri_1061{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d, h, m, s, df, hf, mf, sf, t, tf, tempo;
        String lixo;
        
        lixo = scan.next();
        d = scan.nextInt();
        h = scan.nextInt();
        lixo = scan.next();
        m = scan.nextInt();
        lixo = scan.next();
        s = scan.nextInt();

        lixo = scan.next();
        df = scan.nextInt();
        hf = scan.nextInt();
        lixo = scan.next();
        mf = scan.nextInt();
        lixo = scan.next();
        sf = scan.nextInt();
        t = s + m*60 + h*60*60 + d*60*60*24;
        tf = sf + mf*60 + hf*60*60 + df*60*60*24;
        tempo = tf - t;

        System.out.println(tempo/(60*60*24) + " dia(s)"); tempo = tempo%(60*60*24);
        System.out.println(tempo/(60*60) + " hora(s)"); tempo = tempo%(60*60);
        System.out.println(tempo/(60) + " minuto(s)"); tempo = tempo%(60);
        System.out.println(tempo + " segundo(s)");




    }
}