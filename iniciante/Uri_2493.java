package iniciante;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uri_2493 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String testeQ = scan.nextLine();
            while(testeQ.equals("")){
                testeQ = scan.nextLine();
            }
            int nt = Integer.parseInt(testeQ.trim());
            int aux = 0, aux2;
            int[] numero = new int[3];
            ArrayList<String> erro = new ArrayList<>();
            String aux1;
            String[] simbolos = new String[nt];
            String[] nomes;
            String[] aux4;
            for(int i = 0; i < nt; i++){
                aux1 = scan.nextLine().replace("=", " ");
                while(aux1.equals("")){
                    aux1 = scan.nextLine().replace("=", " ");
                }
                aux4 = aux1.split(" ");
                numero[0] = Integer.parseInt(aux4[0]);
                numero[1] = Integer.parseInt(aux4[1]);
                numero[2] = Integer.parseInt(aux4[2]);
                if((numero[0] + numero[1]) == numero[2]){
                    simbolos[i] = "+";
                }else if((numero[0] - numero[1]) == numero[2]){
                    simbolos[i] = "-";
                }else if((numero[0] * numero[1]) == numero[2]){
                    simbolos[i] = "*";
                }else{
                    simbolos[i] = "l";
                }
            }
            for(int i = 0; i < nt; i++){
                aux1 = scan.nextLine();
                while(aux1.equals("")){
                    aux1 = scan.nextLine();
                }
                nomes = aux1.split(" ");
                aux2 = Integer.parseInt(nomes[1]);
                if(simbolos[aux2-1].equals(nomes[2])){
                    aux++;
                }else{
                    erro.add(nomes[0]);
                }
            }
            if(aux == 0){
                System.out.println("None Shall Pass!");
            }else if(aux == nt){
                System.out.println("You Shall All Pass!");
            }else{
                Collections.sort(erro);
                System.out.println(String.join(" ", erro)
                );
            }
        }
    }
}
