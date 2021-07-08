package iniciante;
import java.util.Scanner;
public class Uri_2161 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        double raiz = 0;
        while(n>0){
            n--;
            raiz += 6.0;
            raiz = 1.0/raiz;
        }
        System.out.printf("%.10f\n", raiz+3.0);
    }
}
