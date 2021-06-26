package iniciante;

import java.util.Scanner;

public class Uri_1828 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int t = scan.nextInt();
        while(i < t){
            i++;
            System.out.println(teste(scan, i));
        }
    }
    public static String teste(Scanner scan, int i){
        String caso1, caso2, resultado = "Bazinga!", aux;
        int cont = 0;
        caso1 = scan.next();
        caso2 = scan.next();
        while(cont < 3){
            cont++;
            if(caso1.equals("tesoura") & (caso2.equals("papel") || caso2.equals("lagarto"))){
                break;
            }else if(caso1.equals("papel") & (caso2.equals("pedra") || caso2.equals("Spock"))){
                break;
            }else if(caso1.equals("pedra") & (caso2.equals("lagarto") || caso2.equals("tesoura"))){
                break;
            }else if(caso1.equals("lagarto") & (caso2.equals("Spock") || caso2.equals("papel"))){
                break;
            }else if(caso1.equals("Spock") & (caso2.equals("tesoura") || caso2.equals("pedra"))){
                break;
            }
            if(cont == 1){
                resultado = "Raj trapaceou!";
                aux = caso1;
                caso1 = caso2;
                caso2 = aux;
            }else{
                resultado = "De novo!";
            }
        }
        return "Caso #"+i+": "+resultado;
    }
}
