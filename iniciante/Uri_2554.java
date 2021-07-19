package iniciante;

import java.util.Scanner;

public class Uri_2554 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int p = scan.nextInt();
            int d = scan.nextInt();
            String[] data = new String[d];
            int[] pessoa = new int[d];
            int aux = 0, posicao = -1;
            for (int i = 0; i < d; i++) {
                data[i] = scan.next();
                for (int t = 0; t < p; t++) {
                    aux = scan.nextInt();
                    pessoa[i] += aux;
                }
                aux = 0;
            }for(int t = 0; t < d; t++) {
                if(pessoa[t] == p){
                    posicao = t;
                    break;
                }
            }
            if(posicao != -1){
                System.out.println(data[posicao]);
            }else{
                System.out.println("Pizza antes de FdI");
            }
        }
    }
}
