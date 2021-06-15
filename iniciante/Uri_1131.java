package iniciante;

import java.util.Scanner;

public class Uri_1131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = false, novo;
        int grem = 0, inter = 0, jogo = 0, aux, aux1, empates = 0;
        while(!loop){
            aux = scan.nextInt();
            aux1 = scan.nextInt();
            if(aux > aux1){
                inter++;
            }else if(aux1 > aux){
                grem++;
            }else{
                empates++;
            }
            novo = false;
            while(!novo){
                System.out.println("Novo grenal (1-sim 2-nao)");
                aux = scan.nextInt();
                if(aux == 1 || aux == 2){
                    if(aux == 2){
                    loop  = true;
                    }
                    novo = true;
                }
            }
            jogo++;
        }
        System.out.println(jogo + " grenais");
        System.out.println("Inter:"+ inter);
        System.out.println("Gremio:"+ grem);
        System.out.println("Empates:"+ empates);
        if(grem > inter){
            System.out.println("Gremio venceu mais");
        }else if(inter > grem){
            System.out.println("Inter venceu mais");
        }else{
            System.out.println("Nao houve vencedor");
        }
    }
}
