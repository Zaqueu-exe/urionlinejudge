package iniciante;

import java.util.Scanner;

public class Uri_1074 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtd;
        int[] numeros;
        qtd = scan.nextInt();
        numeros = new int[qtd];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scan.nextInt();
        }
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == 0){
                System.out.println("NULL");
            }
            else if(numeros[i] % 2 == 0){
                System.out.print("EVEN ");
            }else{
                System.out.print("ODD ");
            }
            if(numeros[i] > 0 ){
                System.out.println("POSITIVE");
            }else if (numeros[i] < 0){
                System.out.println("NEGATIVE");
            }
        }

    }
}
