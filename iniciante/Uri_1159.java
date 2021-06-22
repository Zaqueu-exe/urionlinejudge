package iniciante;

import java.util.Scanner;

public class Uri_1159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        do{
            int soma = 0;
            for(int i = x; i < (x+10); i++){
                if(i % 2 == 0){
                    soma += i;
                }
            }
            System.out.println(soma);
            x = scan.nextInt();
        }while(x != 0);

    }
}
