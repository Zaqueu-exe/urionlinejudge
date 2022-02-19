package iniciante;

import java.util.Scanner;

public class Uri_2808 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] aux1 = scan.next().split("");
        String aux2 = scan.next();
        int posicao11 = posicao(aux1[0]);
        int posicao12 = Integer.parseInt(aux1[1]);

        String[] posicoes = new String[8];
        posicoes[0] = letra(posicao11-1) + (posicao12-2);
        posicoes[1] = letra(posicao11-2) + (posicao12-1);
        posicoes[2] = letra(posicao11+1) + (posicao12-2);
        posicoes[3] = letra(posicao11+2) + (posicao12-1);
        posicoes[4] = letra(posicao11+2) + (posicao12+1);
        posicoes[5] = letra(posicao11+1) + (posicao12+2);
        posicoes[6] = letra(posicao11-1) + (posicao12+2);
        posicoes[7] = letra(posicao11-2) + (posicao12+1);
        String saida = "INVALIDO";
        for(int i = 0; i < posicoes.length; i++){
            if(posicoes[i].equals(aux2)){
                saida = "VALIDO";
                break;
            }
        }
        System.out.println(saida);
        
    }

    public static int posicao(String string) {
        int numero = 0;
        if (string.equals("a")) {
            numero = 1;
        } else if (string.equals("b")) {
            numero = 2;
        } else if (string.equals("c")) {
            numero = 3;
        } else if (string.equals("d")) {
            numero = 4;
        } else if (string.equals("e")) {
            numero = 5;
        } else if (string.equals("f")) {
            numero = 6;
        } else if (string.equals("g")) {
            numero = 7;
        } else {
            numero = 8;
        }
        return numero;
    }
    public static String letra(int numero) {
        String letra = " ";
        if (numero == 1) {
            letra = "a";
        }else if (numero == 2) {
            letra = "b";
        }else if (numero == 3) {
            letra = "c";
        }else if (numero == 4) {
            letra = "d";
        }else if (numero == 5) {
            letra = "e";
        }else if (numero == 6) {
            letra = "f";
        }else if (numero == 7) {
            letra = "g";
        }else{
            letra = "h";
        }
        return letra;
    }
}
