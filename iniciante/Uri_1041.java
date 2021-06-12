package iniciante;
import java.util.Scanner;
public class Uri_1041 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b;
        a = scan.nextFloat();
        b = scan.nextFloat();
        if(a > 0 && b > 0){
            System.out.println("Q1");
        }else if(a < 0 && b < 0){
            System.out.println("Q3");
        }else if(a > 0 && b < 0){
            System.out.println("Q4");
        }else if(a < 0 && b > 0){
            System.out.println("Q2");
        }else if(a != 0 && b == 0 ){
            System.out.println("Eixo X");
        }else if(a == 0 && b != 0){
            System.out.println("Eixo Y");
        }else{
            System.out.println("Origem");
        }
    }
}
