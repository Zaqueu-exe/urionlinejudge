package iniciante;

import java.util.Scanner;


public class Uri_1973 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] es = new int[n];
        int[] percurso = new int[n];
        boolean t = true;
        int posicao = 0;
        long Nroubado = 0, p = 0;
        for(int i = 0; i < es.length; i++){
            es[i] = scan.nextInt();
        }
        while(t){
            if(posicao == -1 || posicao == n){
                break;
            }else if(es[posicao] % 2 == 0){
                if(es[posicao] > 0){
                    es[posicao]--;
                }
                percurso[posicao] = 1;
                posicao--;
            }else if(es[posicao] % 2 == 1){
                if(es[posicao] > 0){
                    es[posicao]--;
                }
                percurso[posicao] = 1;
                posicao++;
            }
        }
        for(int i = 0; i < percurso.length; i++){
            p = percurso[i] + p;
            Nroubado = Nroubado + es[i];
        }
        System.out.println((p)+ " " +(Nroubado));

    }
}
