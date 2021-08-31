package iniciante;

import java.util.Scanner;

public class Uri_2708 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tp = 0, tc = 0;
        while(scan.hasNext()){
            String m = scan.next();
            while(m.equals("")){
                m = scan.next();
            }
            if(m.equals("ABEND")){
                break;
            }
            int p = scan.nextInt();
            if(m.equals("SALIDA")){
                tp = tp + p;
                tc++;
            }else if(m.equals("VUELTA")){
                tp = tp - p;
                tc--;
            }
        }
        System.out.printf("%d%n%d%n", tp, tc);
    }
}
