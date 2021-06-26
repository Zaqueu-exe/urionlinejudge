package iniciante;
import java.util.Scanner;
public class Uri_1827 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 1;
        while(n > -1){
            n = teste(scan);
            for(int i = 0; i < n; i++){
                for(int p = 0; p < n; p++){
                    if((n/2) == i & (n/2) == p){
                        System.out.print(4);
                    }else if((p > (n/3)-1 & i > (n/3)-1)&(p < (n-n/3) & i < (n-n/3))){
                        System.out.print(1);
                    }
                    else if(p == i){
                        System.out.print(2);
                    }else if((p + i) == n-1){
                        System.out.print(3);
                    }else{
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static int teste(Scanner scan){
        int n = 0;
        try{
            n = scan.nextInt();
        }catch(Exception e){
            System.exit(0);
        }
        return n;
    }
}
