package iniciante;
import java.util.Scanner;

public class Uri_1958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        System.out.println(String.format((String.valueOf(a).startsWith("-") ? "" : "+") + "%.4E", a));
    }
}
