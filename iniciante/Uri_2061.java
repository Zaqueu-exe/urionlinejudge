package iniciante;

import java.util.Scanner;

public class Uri_2061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        while(m > 0){
            m--;
            String acao = scan.next();
            if(acao.equals("clicou")){
                n--;
            }else{
                n++;
            }
        }
        System.out.println(n);
    }
}
