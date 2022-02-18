package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri_2791 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List copos = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            copos.add(scan.nextInt());
        }
        System.out.println(copos.indexOf(1) + 1);
    }
}
