package iniciante;

import java.util.Scanner;

public class Uri_2003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String[] h1 = scan.nextLine().split(":");
            int hora1 = 0;
            try{
                hora1 = hora1 + (60 * Integer.parseInt(h1[0]));
            }catch(Exception e){
                System.exit(0);
            }
            hora1 = hora1 + Integer.parseInt(h1[1]);
            if((hora1+60) > 480){
                System.out.println("Atraso maximo: "+ ((hora1+60)-480));
            }else{
                System.out.println("Atraso maximo: "+ 0);
            }
        }
    }
}
