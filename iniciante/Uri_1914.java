package iniciante;

import java.util.Scanner;

public class Uri_1914 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        while(c > 0){
            String nome1 = scan.next();
            String escolha1 = scan.next();
            String nome2 = scan.next();
            String escolha2 = scan.next();
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            if((num1+num2) % 2 == 0){
                if(escolha1.equals("PAR")){
                    System.out.println(nome1);
                }else{
                    System.out.println(nome2);
                }
            }else{
                if(escolha1.equals("IMPAR")){
                    System.out.println(nome1);
                }else{
                    System.out.println(nome2);
                }
            }
            c--;
        }
    }
}
