package iniciante;
import java.util.Scanner;
public class Uri_1043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, t, aa, bb, cc;
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        
        if(((a-b) < c & c < (a+b)) && ((a-c) < b & b < (a+c)) && ((b-c) < a & a < (b+c))){
            System.out.println("Perimetro = "+(a+b+c));
        }else{
            System.out.println("Area = "+((a+b)*c)/2);
        }
    }
}
