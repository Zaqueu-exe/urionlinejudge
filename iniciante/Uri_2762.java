package iniciante;

import java.util.Scanner;

public class Uri_2762 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String[] aux = a.split("\\.");
        System.out.println(Integer.parseInt(aux[1]) + "." + Integer.parseInt(aux[0]));
    }
}
