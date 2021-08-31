package iniciante;

import java.util.Scanner;

public class Uri_2635 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] palavrasA = new String[n];
        for(int i = 0; i < n; i++){
            palavrasA[i] = scan.next();
        }
        n = scan.nextInt();
        String[] palavrasP = new String[n];
        for(int i = 0; i < n; i++){
            palavrasP[i] = scan.next();
        }
        for(int i = 0; i < palavrasP.length ; i++){
            int tamanho = 0, quantidade = 0;
            String[] aux = palavrasP[i].split("");
            for(int t = 0; t < palavrasA.length ; t++){
                String[] aux1 = palavrasA[t].split("");
                int cont = 0;
                while((aux[cont].equals(aux1[cont])) & cont < aux.length-1){
                    cont++;
                }
                if(cont >= aux.length-1){
                    quantidade++;
                    if(aux1.length > tamanho){
                        tamanho = aux1.length;
                    }
                }
            }
            if(quantidade > 0){
                System.out.println(quantidade + " " + tamanho);
            }else{
                System.out.println("-1");
            }
        }
    }
}
