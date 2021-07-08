package iniciante;

import java.util.Scanner;
public class Uri_2146{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            try{
                int a = scan.nextInt();
                System.out.println(a-1);
            }catch(Exception e){
                System.exit(0);
            }
        }
    }
}
