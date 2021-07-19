package iniciante;

import java.util.Scanner;

public class Uri_2543 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int codigo = scan.nextInt();
            int total = 0;
            for (int i = 0; i < n; i++) {
                int codigos = scan.nextInt();
                int id = scan.nextInt();
                if(codigos == codigo & id == 0){
                    total ++;
                }
            }
            System.out.println(total);
        }
    }
}
