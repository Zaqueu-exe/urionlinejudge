package iniciante;

import java.util.Scanner;

public class Uri_1117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float nota, media = 0;
        while(i < 2){
            nota = scan.nextFloat();
            if(nota >= 0 & nota <= 10){
                media = nota + media;
                i++;
            }else{
                System.out.println("nota invalida");
            }
        }
        System.out.println("media = "+ (media/2));
    }
}
