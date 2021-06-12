package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        float[][] media;
        int casos;
        casos = scan.nextInt();
        media = new float[casos][3];
        for(int i = 0; i < media.length; i++){
            for(int p = 0; p < media[i].length; p++){
                media[i][p] = scan.nextFloat();
                if(p == 0){
                    media[i][p] = media[i][p] * 2;
                }else if(p == 1){
                    media[i][p] = media[i][p] * 3;
                }else if(p == 2){
                    media[i][p] = media[i][p] * 5;
                }
            }
        }
        for(float[] notas : media){
            float total = 0;
            for(float medias : notas){
                total = medias + total;
            }
            System.out.println(df.format(total/10));
        }
    }
}
