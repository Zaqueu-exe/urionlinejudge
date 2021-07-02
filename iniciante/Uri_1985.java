package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1985 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int qtd = scan.nextInt();
        double total = 0;
        while(qtd > 0){
            int codigo = scan.nextInt();
            int quantidade = scan.nextInt();
            switch(codigo){
                case 1001: total = total + (1.50*quantidade); break;
                case 1002: total = total + (2.50*quantidade); break;
                case 1003: total = total + (3.50*quantidade); break;
                case 1004: total = total + (4.50*quantidade); break;
                case 1005: total = total + (5.50*quantidade); break;
            }
            qtd--;
        }
        System.out.println(df.format(total));
    }
}
