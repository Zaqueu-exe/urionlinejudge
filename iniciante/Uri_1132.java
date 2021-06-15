package iniciante;
import java.util.Scanner;
public class Uri_1132{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int aux;
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        if(n1 < 0 || n2 < 0){
            System.exit(0);
        }
        if(n1 > n2){
            aux = n2;
            n2 = n1;
            n1 = aux;
        }
        aux = 0;
        for(int i = n1; i <= n2; i++){
            if(!(i % 13 == 0)){
                aux = aux + i;
            }
        }
        System.out.println(aux);
    }
}
