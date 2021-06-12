package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Uri_1036 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00000");
        Scanner scan = new Scanner(System.in);
        double a, b, c, x, r1, r2;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        testara(a);
        x = (b*b)-4*a*c;
        testarx(x);
        x = Math.sqrt(x);
        r1 = (-b+x)/(2*a);
        r2 = (-b-x)/(2*a);

        System.out.println("R1 = "+df.format(r1));
        System.out.println("R2 = "+df.format(r2));

    }

    public static boolean testara(double a){
        if(a == 0){
            System.out.println("Impossivel calcular");
            System.exit(0);
        }
        return true;
    }
    public static boolean testarx(double x){
        if(x < 0){
            System.out.println("Impossivel calcular");
            System.exit(0);
        }
        return true;
    }
}
