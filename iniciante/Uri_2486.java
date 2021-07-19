package iniciante;

import java.util.Scanner;
public class Uri_2486 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String nome = " ";
        int qtd = 0, c = 0;
        while(n != 0){
            c = 0;
            while(n > 0){
                qtd = scan.nextInt();
                nome = scan.nextLine();
                nome = nome.replace(" ", "");

                switch(nome){
                    case "sucodelaranja" : c = c + (qtd*120); break;
                    case "morangofresco" : c = c + (qtd*85); break;
                    case "mamao" : c = c + (qtd*85); break;
                    case "goiabavermelha" : c = c + (qtd*70); break;
                    case "manga" : c = c + (qtd*56); break;
                    case "laranja" : c = c + (qtd*50); break;
                    case "brocolis" : c = c + (qtd*34); break;
                }
                n--;
            }
            if(c < 110){
                System.out.println("Mais " + (110 - c) + " mg");
            }else if(c > 130){
                System.out.println("Menos " + (c - 130) + " mg");
            }else{
                System.out.println(c + " mg");
            }
            n = scan.nextInt();
        }
    }
}
