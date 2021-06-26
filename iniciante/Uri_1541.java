package iniciante;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Uri_1541 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 1;
        DecimalFormat df = new DecimalFormat("0");
        while(a != 0){
            double aux = 0, area;
            double j = 0;
            a = scan.nextInt();
            if(a == 0){
                System.exit(0);
            }
            double b = scan.nextInt();
            double c = scan.nextInt();
            area = a*b;
            aux = (100.0/c)*area;
            j = Math.floor(Math.sqrt(aux));
            System.out.println(df.format(j));
        }
    }
}
