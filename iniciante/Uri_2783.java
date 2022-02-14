package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_2783 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> fc = new ArrayList<>();
        ArrayList<Integer> fm = new ArrayList<>();
        for(int i = 0; i < c; i++){
            fc.add(scan.nextInt());
        }
        for(int i = 0; i < m; i++){
            fm.add(scan.nextInt());
        }
        for(int i = 0; i < fc.size(); i++){
            if(fm.contains(fc.get(i))){
                c--;
            }
        }
        if(c < 0){
            System.out.println(0);
        }else{
            System.out.println(c);
        }
    }
}
