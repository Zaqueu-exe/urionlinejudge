package iniciante;

import java.util.Scanner;

public class Uri_1866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        while(c > 0){
            int num = scan.nextInt();
            if(num % 2 == 0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
            c--;
        }
    }
}
