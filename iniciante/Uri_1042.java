package iniciante;
import java.util.Scanner;
public class Uri_1042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
            b[i] = a[i];
        }
        for(int i = 0; i < a.length; i++){
            for(int o = 0; o < b.length - 1; o++){
                if(a[o] > a[o + 1]){
                    int t;
                    t = a[o + 1];
                    a[o + 1] = a[o];
                    a[o] = t;
                }
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        for(int i = 0; i < a.length; i++){
            System.out.println(b[i]);
        }

    }
}
