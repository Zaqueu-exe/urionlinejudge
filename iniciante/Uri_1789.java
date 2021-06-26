package iniciante;
import java.util.Scanner;
public class Uri_1789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean teste = true;
        int l = 0;
        while(teste){
            l = testeL(scan);
            int v, mv = 0;
            for(int i = 0; i < l; i++){
                v = scan.nextInt();
                if(v > mv){
                    mv = v;
                }
            }
            if(mv < 10){
                System.out.println("1");
            }else if(mv < 20){
                System.out.println("2");
            }else{
                System.out.println("3");
            }
        }
    }
    public static int testeL(Scanner scan){
        int n = 0;
        try{
            n = scan.nextInt();
        }catch(Exception e){
            System.exit(0);
        }
        return n;
    }
}
