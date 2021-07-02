package iniciante;

import java.util.Scanner;

public class Uri_1865{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String nome;
        int pode;
        while(n > 0){
            nome = scan.next();
            pode = scan.nextInt();
            teste(pode);
            if(nome.equals("Thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
            n--;
        }
    }
    public static void teste(int n) {
        if(n < 1 || n > 25000){
            System.exit(0);
        }
    }
}