package iniciante;

import java.util.Scanner;

public class Uri_2780{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();
        if(d <= 800){
            System.out.println(1);
        }else if(d <= 1400){
            System.out.println(2);
        }else{
            System.out.println(3);
        }
        scan.close();
    }
}