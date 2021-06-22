package iniciante;
import java.util.Scanner;
public class Uri_1151 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x < 0 || x >=45){
            System.exit(0);
        }
        for(int i = 0; i < x-1; i++){
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(fibonacci(x-1));
    }
    public static int fibonacci(int x){
        int proxi = 0, anter = 0;
        for(int i = 0; i <= x; i++){
            if(i == 1){
                proxi = 1;
            }else{
                proxi = proxi + anter;
                anter = proxi - anter;
            }
        }
        return proxi;
    }
}
