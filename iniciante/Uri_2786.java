package iniciante;

import java.util.Scanner;

public class Uri_2786 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int c = scan.nextInt();
        int total1 = (l*c) + (l-1)*(c-1);
        int total2 = ((l-1)*2)+((c-1)*2);
        System.out.println(total1); 
        System.out.println(total2);
    }
}
