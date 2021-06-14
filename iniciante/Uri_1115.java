package iniciante;
import java.util.Scanner; 
public class Uri_1115{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[10];
        int[] y = new int[10];
        int contator = 0;

        for(int i = 0; i < x.length; i++){
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();

            if(x[i] == 0 || y[i] ==0){
                break;
            }
            contator++;
        }

        for(int i = 0; i < contator; i++){
            if(x[i] > 0 & y[i] > 0){
                System.out.println("primeiro");
            }else if(x[i] < 0 & y[i] < 0){
                System.out.println("terceiro");
            }else if(x[i] > 0 & y[i] < 0){
                System.out.println("quarto");
            }else if(x[i] < 0 & y[i] > 0){
                System.out.println("segundo");
            }
        }
    }
}