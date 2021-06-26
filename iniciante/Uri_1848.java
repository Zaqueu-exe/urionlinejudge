package iniciante;

import java.util.Scanner;

public class Uri_1848 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gesto;
        int i = 0, numero = 0;
        while(i < 3){
            gesto = scan.nextLine();
            if(gesto.equals("caw caw")){
                System.out.println(numero);
                i++;
                numero = 0;
            }
            numero = numero + binario(gesto);
            if(numero > 1000){
                System.exit(0);
            }

        }
    }
    public static int binario(String gesto){
        int n = 0;
        if(gesto.equals("--*")){
            n = 1;
        }else if(gesto.equals("-*-")){
            n = 2;
        }else if(gesto.equals("*--")){
            n = 4;
        }else if(gesto.equals("*-*")){
            n = 5;
        }else if(gesto.equals("-**")){
            n = 3;
        }else if(gesto.equals("**-")){
            n = 6;
        }else if(gesto.equals("***")){
            n = 7;
        }
        return n;
    }
}
