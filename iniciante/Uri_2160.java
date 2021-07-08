package iniciante;

import java.util.Scanner;

public class Uri_2160 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        if(palavra.length() > 80){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
