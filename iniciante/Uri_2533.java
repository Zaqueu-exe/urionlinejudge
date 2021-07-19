package iniciante;
import java.util.Scanner;

public class Uri_2533 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, nota, hora;

        while (scan.hasNext()) {
            float aux = 0, ch = 0;
            n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                nota = scan.nextInt();
                hora = scan.nextInt();

                aux = aux + (nota * hora);
                ch += hora;
            }
            System.out.printf("%.4f\n", aux / (ch * 100.0f));
        }
    }
}
