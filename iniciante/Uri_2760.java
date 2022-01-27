package iniciante;

import java.util.Scanner;

public class Uri_2760 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String a = scan.nextLine();
            String b = scan.nextLine();
            String c = scan.nextLine();
            System.out.println(a + b + c);
            System.out.println(b + c + a);
            System.out.println(c + a + b);
            System.out.println(teste(a) + teste(b) + teste(c));
        }
    }
    public static String teste(String aux){
        StringBuffer sb = new StringBuffer();
        if(aux.length() > 10){
            for(int i = 0; i < 10; i++){
                sb.append(aux.charAt(i));
            }
        }else return aux;
        return sb.toString();
    }
}
