package iniciante
;

import java.util.Scanner;

public class Uri_1060{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] valores = new float[6];
        int cont = 0;
        valores[0] = scan.nextFloat();
        valores[1] = scan.nextFloat();
        valores[2] = scan.nextFloat();
        valores[3] = scan.nextFloat();
        valores[4] = scan.nextFloat();
        valores[5] = scan.nextFloat();
        for(int i = 0; i < valores.length; i++){
            if(valores[i] > 0){
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}
