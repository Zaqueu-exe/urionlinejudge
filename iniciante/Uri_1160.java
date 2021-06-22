package iniciante;
import java.util.Scanner;

public class Uri_1160 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int anos;
        for(int i = 0; i < t; i++){
            double pa = scan.nextDouble();
            double pb = scan.nextDouble();
            double g1 = scan.nextDouble();
            double g2 = scan.nextDouble();
            g1 /= 100;
            g2 /= 100;
            for(anos = 0; pa <= pb; anos++){
                pa = Math.floor(pa + (pa * g1));
                pb = Math.floor(pb + (pb * g2));
                if(anos > 100){
                    break;
                }
            }
            if(anos > 100){
                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.println(anos + " anos.");
            }
        }
    }
}
