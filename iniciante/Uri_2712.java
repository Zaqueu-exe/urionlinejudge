package iniciante;

import java.util.Scanner;

public class Uri_2712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String placa = scan.next();
                    if (teste(placa)) {
                        int f = Integer.valueOf(String.valueOf(placa.charAt(7)));
                        if (f == 1 || f == 2) {
                            System.out.println("MONDAY");
                        } else if (f == 3 || f == 4) {
                            System.out.println("TUESDAY");
                        } else if (f == 5 || f == 6) {
                            System.out.println("WEDNESDAY");
                        } else if (f == 7 || f == 8) {
                            System.out.println("THURSDAY");
                        } else if (f == 9 || f == 0) {
                            System.out.println("FRIDAY");
                        }
                    }else {
                        System.out.println("FAILURE");
                    }
        }
    }
    public static boolean teste(String placa){
        return placa.matches("[A-Z]{3}-[0-9]{4}");
    }
}
