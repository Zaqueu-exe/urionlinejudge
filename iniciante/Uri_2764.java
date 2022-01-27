package iniciante;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Uri_2764 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String[] aux = a.split("/");
        System.out.println(aux[1] + "/" + aux[0] + "/" + aux[2]);
        System.out.println(aux[2] + "/" + aux[1] + "/" + aux[0]);
        System.out.println(aux[0] + "-" + aux[1] + "-" + aux[2]);
    }
}
