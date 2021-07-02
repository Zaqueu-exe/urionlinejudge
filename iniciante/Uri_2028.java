package iniciante;

import java.util.Scanner;
public class Uri_2028 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont, caso = 1, n = 0;

        while(caso >= 0){
            StringBuilder str = new StringBuilder();
            try{
                n = scan.nextInt();
            }catch(Exception e){
                System.exit(0);
            }
            cont = 0;
            if(n == 0){
                System.out.println("Caso" + " " + caso + ": " + 1 +" numero");
                System.out.println(0);
                System.out.println();
                caso++;
                continue;
            }
            for(int i = 0; i <= n; i++){
                for(int p = 0; p < i; p++){
                    cont++;
                }
            }
            System.out.println("Caso" + " " + caso + ": " + (cont+1) +" numeros");
            System.out.print(0);
            for(int i = 0; i <= n; i++){
                for(int p = 0; p < i; p++){
                    str.append(" " + i);
                }
            }
            caso++;
            System.out.print(str.toString());
            System.out.println();
            System.out.println();
        }
    }
}
