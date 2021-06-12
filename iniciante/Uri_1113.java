package iniciante;
import java.util.Scanner;
public class Uri_1113 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] valores = new int[10][2];
        int cont = 0;
        for(int i = 0; i < valores.length; i++){
            valores[i][0] = scan.nextInt();
            valores[i][1] = scan.nextInt();
            if(valores[i][0] == valores[i][1]){
                break;
            }
            cont++;
        }
        for(int i = 0; i < cont; i++){
            if(valores[i][0] > valores[i][1]){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }
        }
    }
}
