package iniciante;

import java.util.Scanner;

public class Uri_2787 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(retorno(l, c));
    }

    public static int retorno(int l, int c) {
        int aux = 0;
        if (l % 2 == 1 && c % 2 == 1 || l % 2 == 0 && c % 2 == 0) {
            aux = 1;
        }
        return aux;
    }
}
