package iniciante;

import java.util.Scanner;

public class Uri_2313 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int aux;
        String tipo = " ";
        if(a > b){
            aux = a;
            a = b;
            b = aux;
        }
        if(b > c){
            aux = b;
            b = c;
            c = aux;
        }
        if(a > b){
            aux = a;
            a = b;
            b = aux;
        }
        if((a+b) > c){
            if(a == b & b == c){
                tipo = "Equilatero";
            }else if(a == b || a == c || b == c){
                tipo = "Isoceles";
            }else if(a != b & b != c){
                tipo = "Escaleno";
            }
            if(a*a + b * b == c*c){
                System.out.println("Valido-" + tipo);
                System.out.println("Retangulo: S");
            }else{
                System.out.println("Valido-" + tipo);
                System.out.println("Retangulo: N");
            }
        }else{
            System.out.println("Invalido");
        }
    }
}
