package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1154 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int idade = scan.nextInt();
        int cont = 0;
        float media = 0;
        while(idade > 0){
            media = media + idade;
            idade = scan.nextInt();
            cont++;
        }
        System.out.println(df.format(media/cont));
    }
}
