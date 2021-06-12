package iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Uri_1038 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        double a, b, c = 0;
        a = scan.nextDouble();
        b = scan.nextDouble();
        if(a == 1){
            c = 4;
        }else if(a == 2){
            c = 4.5;
        }else if(a == 3){
            c = 5;
        }else if(a == 4){
            c = 2;
        }else if(a == 5){
            c = 1.5;
        }
        c = c * b;
        System.out.println("Total: R$ "+ df.format(c));
    }
}
