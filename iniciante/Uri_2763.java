package iniciante;

import java.util.Scanner;

public class Uri_2763 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String[] aux = a.split("\\.");
        System.out.println(aux[0]);
        System.out.println(aux[1]);
        String[] aux1 = aux[2].split("-");
        System.out.println(aux1[0]);
        System.out.println(aux1[1]);
    }
}
