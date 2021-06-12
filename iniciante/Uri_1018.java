package iniciante;

import java.util.Scanner;

public class Uri_1018 {
    public static void main(String[] args) {
        int[] valor = new int[] {100, 50, 20, 10, 5, 2, 1};
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(!(0 < a & a < 100000)){
            System.exit(0);
        }
        System.out.print(a+"\n");
        for(int i = 0; i < valor.length; i++){
            int quantidade = 0;
            while(a - valor[i] >= 0){
                a = a - valor[i];
                quantidade++;
            }
            System.out.print(quantidade + " nota(s) de R$ " +(valor[i])+",00"+"\n");
        }
    }
}
