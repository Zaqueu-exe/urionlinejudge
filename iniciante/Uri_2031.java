package iniciante;

import java.util.Scanner;

public class Uri_2031 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n > 0){
            n--;
            String j1 = scan.next();
            String j2 = scan.next();

            if(j1.equals("papel") & j2.equals("papel")){
                System.out.println("Ambos venceram");
            }else if(j1.equals("ataque") & j2.equals("ataque")){
                System.out.println("Aniquilacao mutua");
            }else if(j1.equals("pedra") & j2.equals("pedra")){
                System.out.println("Sem ganhador");
            }else if((j1.equals("ataque") & j2.equals("pedra")) || (j1.equals("pedra") & j2.equals("papel")) || (j1.equals("ataque") & j2.equals("papel"))){
                System.out.println("Jogador 1 venceu");
            }else{
                System.out.println("Jogador 2 venceu");
            }
        }
    }
}
