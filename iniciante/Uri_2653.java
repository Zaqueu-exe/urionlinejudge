package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri_2653 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> v = new ArrayList<>();
        while(scan.hasNext()){
            String tt = scan.next();
            if(!v.contains(tt)){
                v.add(tt);
            }
        }
        System.out.println(v.size());
    }
}
