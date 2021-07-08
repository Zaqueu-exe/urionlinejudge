package iniciante;

import java.util.Scanner;

public class Uri_2165 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();
        if(t.length() > 140){
            System.out.println("MUTE");
        }else{
            System.out.println("TWEET");
        }
    }
}
