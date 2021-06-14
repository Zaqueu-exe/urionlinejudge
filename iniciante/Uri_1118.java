package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float[] x = new float[25];
        float[] x1 = new float[25];
        boolean nota = false, novo;
        int cont = 0, opc;
        while(!nota){
            x[cont] = testarNota(scan);
            x1[cont] = testarNota(scan);
            System.out.println("media = " + df.format((x[cont] + x1[cont])/2));
            cont++;

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
