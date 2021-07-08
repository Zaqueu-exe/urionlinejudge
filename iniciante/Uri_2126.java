package iniciante;
import java.util.Scanner;
public class Uri_2126 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        while(scan.hasNext()){
            cont++;
            String[] aux = scan.next().split("");
            if(aux[0].equalsIgnoreCase("E")){
                System.exit(0);
            }
            String[] aux1 = scan.next().split("");
            int aux03 = 0,sbs = 0, pos = 0;
            for(int i = 0; i < aux1.length; i++){
                if(aux[0].equals(aux1[i])){
                    if(i > (aux1.length - aux.length)){
                        break;
                    }
                    for(int u = 0; u < aux.length; u++){
                        if(aux[u].equals(aux1[i+u])){
                            aux03++;
                        }
                    }
                    pos = i + 1;
                }
                if(aux03 == aux.length){
                    sbs++;
                }
                aux03 = 0;
            }
            System.out.println("Caso #" + cont + ":");
            if(sbs == 0){
                System.out.println("Nao existe subsequencia");
            }else{
                System.out.println("Qtd.Subsequencias: " + sbs);
                System.out.println("Pos: "+ pos);
            }
            System.out.println();
        }
    }
}
