package iniciante;

import java.util.Scanner;

public class Uri_2059{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int j1 = scan.nextInt();
        int j2 = scan.nextInt();
        int r = scan.nextInt();
        int a = scan.nextInt();
        int aux = j1 + j2;

        if(r == 0 & a == 0){
            if(aux%2 == 0){
                if(p == 0){
                    System.out.println("Jogador 2 ganha!");
                }else{
                    System.out.println("Jogador 1 ganha!");
                }
            }else{
                if(p == 0){
                    System.out.println("Jogador 1 ganha!");
                }else{
                    System.out.println("Jogador 2 ganha!");
                }
            }
        }else if((r == 1 & a == 0) || (r == 0 & a == 1)){
            System.out.println("Jogador 1 ganha!");
        }else{
            System.out.println("Jogador 2 ganha!");
        }
    }
}