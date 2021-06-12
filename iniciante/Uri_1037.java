package iniciante;
import java.util.Scanner;
public class Uri_1037 {
    public static void main(String[] args){
        double a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        if(a >= 0 && a <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(a > 25 && a <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(a > 50 && a <= 75){
            System.out.println("Intervalo [50,75]");
        }else if(a > 75 && a <= 100){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
