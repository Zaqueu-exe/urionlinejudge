package iniciante;
import java.util.Scanner;
public class Uri_2310 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float st = 0, bt = 0, at = 0, ss = 0, bs = 0, as = 0;
        while(n > 0){
            n--;
            String nome = scan.next();
            int s = scan.nextInt();
            int b = scan.nextInt();
            int a = scan.nextInt();
            int s1 = scan.nextInt();
            int b1 = scan.nextInt();
            int a1 = scan.nextInt();
            st += s;
            bt += b;
            at += a;
            ss += s1;
            bs += b1;
            as += a1;
        }
        System.out.printf("%s%.2f%s\n", "Pontos de Saque: ", ((ss*100.0)/st) , " %.");
        System.out.printf("%s%.2f%s\n", "Pontos de Bloqueio: ", (bs*100.0)/bt, " %.");
        System.out.printf("%s%.2f%s\n", "Pontos de Ataque: ", (as*100.0)/at, " %.");
    }
}
