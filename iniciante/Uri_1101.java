package iniciante;

import java.util.Scanner;

public class Uri_1101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aux, maior, menor, cont = 0;
        int[][] valores = new int[10][2];
        for(int i = 0; i <= valores.length; i++){
            valores[i][0] = scan.nextInt();
            valores[i][1] = scan.nextInt();
            if(valores[i][1] < 1 || valores[i][0] < 1){
                break;
            }
            cont++;
        }
        for(int i = 0; i < cont; i++){
            maior = valores[i][0];
            menor = valores[i][1];
            if(menor > maior){
                aux = maior;
                maior = menor;
                menor = aux;
            }
            aux = 0;
            for(int s = menor; s <= maior; s++){
                System.out.print(s+" ");
                aux = s + aux;
            }
            System.out.println("Sum=" + aux);
        }
    }
}
