package iniciante;

import java.util.Scanner;

public class Uri_1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String aux, aux1, aux2;
        aux = scan.next();
        aux1 = scan.next();
        aux2 = scan.next();
        switch(aux){
            case "vertebrado" : switch(aux1){
                case "ave" : switch(aux2){
                    case "carnivoro" : System.out.println("aguia"); break;
                    case "onivoro" : System.out.println("pomba"); break;
                }break;
                case "mamifero" : switch(aux2){
                    case "onivoro" : System.out.println("homem"); break;
                    case "herbivoro" : System.out.println("vaca"); break;
                }
            }
            case "invertebrado" : switch(aux1){
                case "inseto" : switch(aux2){
                    case "hematofago" : System.out.println("pulga"); break;
                    case "herbivoro" : System.out.println("lagarta"); break;
                }break;
                case "anelideo" : switch(aux2){
                    case "hematofago" : System.out.println("sanguessuga"); break;
                    case "onivoro" : System.out.println("minhoca"); break;
                }
            }
        }
    }
}
