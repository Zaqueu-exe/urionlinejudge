package iniciante;

import java.util.Scanner;

public class Uri_1142 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= n * 4; i++){
            if(i % 4 == 0){
                System.out.println("PUM");
            }else{
                System.out.print(i + " ");
            }
        }
    }
}
