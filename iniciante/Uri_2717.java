package iniciante;

import java.util.Scanner;

public class Uri_2717 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            if((n1 + n2) <= n){
                System.out.println("Farei hoje!");
            }else{
                System.out.println("Deixa para amanha!");
            }
        }
    }
}
