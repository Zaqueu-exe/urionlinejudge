package iniciante;
import java.util.Scanner;

public class Uri_2715 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            Long sum = 0l;
            Long diferenca = 0l;
            Long diferenca1 = 0l;
            Long[] x = new Long[n];
            for (int i = 0; i < n; i++) {
                x[i] = scan.nextLong();
                sum += x[i];
            }
            for (int i = n - 1; i >= 0; i--) {
                if ((diferenca + x[i]) <= (sum / 2)) {
                    diferenca += x[i];
                } else {
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if ((diferenca1 + x[i]) <= (sum / 2)) {
                    diferenca1 += x[i];
                } else {
                    break;
                }
            }
            if ((sum - diferenca * 2) < (sum - diferenca1 * 2)) {
                System.out.println(sum - diferenca * 2);
            } else {
                System.out.println(sum - diferenca1 * 2);
            }
        }
        scan.close();
    }
}
