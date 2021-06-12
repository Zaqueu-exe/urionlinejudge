package iniciante;

import java.util.Scanner;

public class Uri_1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, aux;
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        if(a < 1 || b < 1 || c < 1){
            System.exit(05);

        }

        if(c > a){
            aux = c;
            c = a;
            a = aux;
        }if(b > a){
            aux = a;
            a = b;
            b = aux;
        }if(c > b){
            aux = b;
            b = c;
            c = aux;
        }
        if(!(a >= (b+c))){
            a = a * a;
            b = b * b;
            c = c * c;
            if(a == (b+c)){
                System.out.println("TRIANGULO RETANGULO");
            }if(a > (b+c)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }if(a < (b+c)){
                System.out.println("TRIANGULO ACUTANGULO");
            }if(a == b & b == c & a == c){
                System.out.println("TRIANGULO EQUILATERO");
            }if((a == b & a != c) || (b == c & b != a) || (a == c & a != b)){
                System.out.println("TRIANGULO ISOSCELES");
            }

        }else{
            System.out.println("NAO FORMA TRIANGULO");
        }

    }
}
