package iniciante;
import java.util.Scanner;
public class Uri_1564 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        n = teste(scan, n);
        while(n <= 100 & n >= 0){
            if(n == 0){
                System.out.println("vai ter copa!");
            }else{
                System.out.println("vai ter duas!");
            }
            n = teste(scan, n);
        }
    }
    public static int teste(Scanner scan, int n){
        try{
            n = scan.nextInt();
        }catch(Exception e){
            System.exit(0);
        }
        return n;
    }
}
