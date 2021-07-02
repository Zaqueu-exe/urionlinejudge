package iniciante;

import java.util.Scanner;

public class Uri_2057 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int f = scan.nextInt();
        int aux = s + t + f;
        if(aux < 0){
            System.out.println(aux + 24);
        }else if(aux == 24){
            System.out.println(24-aux);
        }else if(aux > 24){
            System.out.println(aux-24);
        }else{
            System.out.println(aux);
        }
    }
}
