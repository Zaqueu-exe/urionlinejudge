package iniciante;

import java.util.Scanner;

public class Uri_1046{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hora = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10 , 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,22, 23};
        boolean valida = true;
        int cont = 24, inicio, terminio;
        System.out.println("Digite a hora de inicio de terminio");
        inicio = scan.nextInt();
        terminio = scan.nextInt();
        if(inicio != terminio){
            cont = 0;
            do{
                for(int i = inicio; i < 24; i++){
                    if(i == terminio){
                        valida = false;
                        break;
                    }
                    cont += 1;
                }
                inicio = 0;
            }while(valida);
        }
        System.out.println("O JOGO DUROU "+ cont+ " HORA(S)");
    }
}