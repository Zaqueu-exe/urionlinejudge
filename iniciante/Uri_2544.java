package iniciante;

import java.util.Scanner;

public class Uri_2544 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String sn = scan.nextLine();
            while(sn.equals(null)){
                sn = scan.nextLine();
            }
            int n = Integer.parseInt(sn);
            int i = 0;
            while (n > 0) {
                n = n / 2;
                i++;
            }
            System.out.println(i - 1);
        }
    }
}
