package iniciante;

import java.util.Scanner;

public class Uri_2727 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            int n = scan.nextInt();
            scan.nextLine();
            String[] letras = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                    "r", "s", "t", "u", "v", "w", "x", "y", "z" };
            String[] resultado = new String[n];
            for (int i = 0; i < n; i++) {
                int aux2 = 0;
                String aux = scan.nextLine();
                String[] aux1 = aux.split(" ");
                if (aux1.length > 1) {
                    aux2 = (aux1.length - 1) * 3;
                }
                aux2 = aux2 + aux1[aux1.length - 1].length();
                resultado[i] = letras[aux2 - 1];
            }
            for (String l : resultado) {
                System.out.println(l);
            }
        }
    }
}
