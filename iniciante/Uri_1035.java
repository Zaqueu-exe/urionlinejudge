package iniciante;
import java.util.Scanner;
public class Uri_1035 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        if(b > c & d > a & (((c+d) > (a+b)) & (c > 0 & d > 0 & a%2 ==0))){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
