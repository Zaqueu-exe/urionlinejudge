package iniciante;
import java.util.Scanner;
public class Uri_1044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, aux;
        a = scan.nextInt();
        b = scan.nextInt();
        if(b > a){
            aux = b;
            b = a;
            a = aux;
        }
        if(a % b == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
