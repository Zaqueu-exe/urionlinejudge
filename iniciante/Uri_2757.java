package iniciante;

import java.util.Scanner;

public class Uri_2757 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        System.out.printf("A = %d, B = %d, C = %d\n", n1, n2, n3);
        System.out.printf("A = %10d, B = %10d, C = %10d\n", n1, n2, n3);
        System.out.printf("A = %010d, B = %010d, C = %010d\n", n1, n2, n3);
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", n1, n2, n3);
    }
}
