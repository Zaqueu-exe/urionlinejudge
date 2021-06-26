package iniciante;
import java.util.Scanner;
public class Uri_1837 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > 0){
            System.out.println(a/b + " " +a%b);
        }else{
            int aux, aux1 = 0, i = 0;
            aux = b;
            if(b < 0){
                aux = b*-1;
            }
            for(i = 0; i < aux; i++){
                aux1 = a - i;
                if(aux1 % b == 0){
                    break;
                }
            }
            System.out.println(aux1/b + " " +i);

        }
    }
}
