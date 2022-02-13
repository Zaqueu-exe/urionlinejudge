package iniciante;

import java.util.ArrayList;
import java.util.Scanner;

public class Uri_2779 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        int c = scan.nextInt();
        for(int i = 0; i < c; i++){
            list.add(scan.nextInt());
        }
        for(int i = 0; i < c; i++){
            int aux = list.get(i);
            if(aux != -1){
                n--;
                for(int p = 0; p < c; p++){
                    if(list.get(p) == aux){
                        list.set(p, -1);
                    }
                }
            }
        }
        System.out.println(n);
    }
}
