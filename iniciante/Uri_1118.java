package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float x, x1;
        boolean nota = false, novo;
        int opc;
        while(!nota){
            x = testarNota(scan);
            x1 = testarNota(scan);
            System.out.println("media = " + df.format((x + x1)/2));

            novo = false;
            while(!novo){
                System.out.println("novo calculo (1-sim 2-nao)");
                opc = scan.nextInt();
                if(opc == 1 || opc == 2){
                    if(opc == 2){
                        nota = true;
                    }
                    novo = true;

                }
            }
        }
    }
    public static float testarNota(Scanner scan){
        float nota = 0;
        boolean teste = false;
        while(!teste){
            nota = scan.nextFloat();
            if(!(nota < 0 || nota > 10)){
                teste = true;
            }else{
                System.out.println("nota invalida");
            }
        }
        return nota;
    }
}
