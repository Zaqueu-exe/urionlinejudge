package iniciante;

import java.util.Scanner;

public class Uri_1847 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a > b){
            if(b <= c || (a-b) > (b-c)){
                System.out.println(":)");
            }else{
                System.out.println(":(");
            }
        }else if(a < b){
            if(b >= c || b-a > c-b){
                System.out.println(":(");
            }else{
                System.out.println(":)");
            }
        }else{
            if(b >= c){
                System.out.println(":(");
            }else{
                System.out.println(":)");
            }
        }
    }
}
