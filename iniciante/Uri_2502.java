package iniciante;
import java.util.Scanner;

public class Uri_2502 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] aux = scan.nextLine().split(" ");
            int tpalavras = Integer.parseInt(aux[1]);
            String aux3 = scan.nextLine();
            String aux4 = scan.nextLine();
            char[] p1 = aux3.toLowerCase().toCharArray();
            char[] p2 = aux4.toLowerCase().toCharArray();
            for (int i = 0; i < tpalavras; i++) {
                String texto = scan.nextLine();
                char[] letra = texto.toCharArray();
                char[] letras = texto.toLowerCase().toCharArray();

                for (int t = 0; t < letras.length; t++) {
                    for (int g = 0; g < p2.length; g++) {
                        if(p2[g] == (letras[t])){
                            letras[t] = p1[g];
                        }else if(p1[g] == (letras[t])){
                            letras[t] = p2[g];
                        }
                    }
                }
                String palavraC = "";
                for (int g = 0; g < letras.length; g++) {
                    if(Character.isUpperCase(letra[g])){
                        palavraC = palavraC + Character.toUpperCase(letras[g]);
                    }else{
                        palavraC = palavraC + letras[g];
                    }
                }
                System.out.println(palavraC);
            }
            System.out.println();
        }
    }
}
