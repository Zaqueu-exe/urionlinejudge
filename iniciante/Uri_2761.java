package iniciante;

import java.util.Scanner;

public class Uri_2761 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        char c = scan.next().charAt(0);
        String d = scan.nextLine();
        String[] aux = d.split("");
        String aux1 = "";
        for(int i = 1; i < aux.length; i++){
            aux1 += aux[i];
        }
        System.out.printf("%d%.6f%c%s\n", a, b, c , aux1);
        System.out.printf("%d\t%.6f\t%c\t%s\n", a, b, c , aux1);
        System.out.printf("%10d%10f%10c%10s\n", a, b, c, aux1);
    }
}
