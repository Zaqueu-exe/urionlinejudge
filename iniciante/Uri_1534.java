package iniciante;
import java.util.Scanner;
public class Uri_1534 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = 0;
        l = teste(scan, l);
        while(l <= 70){
            int aux = 0, aux1 = l-1;
            for(int i = 0; i < l; i++){
                for(int o = 0; o < l; o++){
                    if(aux1 == o){
                        System.out.print(2);
                        continue;
                    }
                    if(aux == o){
                        System.out.print(1);
                        continue;
                    }
                    System.out.print(3);
                }
                aux++;
                aux1--;
                System.out.print("\n");
            }
            l = teste(scan, l);
        }
    }
    public static int teste(Scanner scan, int n){
        int p = 0;
        try{
            p = scan.nextInt();
        }catch(Exception e){
            System.exit(0);
        }
        return p;
    }
}
