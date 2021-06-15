package iniciante;

import java.util.Scanner;

public class Uri_1134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean fim = false;
        int gasolina = 0, alcool = 0, diesel = 0, opc;
        while(!fim){
            opc = scan.nextInt();
            if(opc < 0){
                System.exit(0);
            }
            switch(opc){
                case 1 : alcool++; break;
                case 2 : gasolina++; break;
                case 3 : diesel++; break;
                case 4 : fim = true; break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
