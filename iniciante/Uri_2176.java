package iniciante;

import java.util.Scanner;

public class Uri_2176{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        String[] v = n.split("");
        int aux = 0;
        for(int i = 0; i < v.length; i++){
            aux = aux + Integer.parseInt(v[i]);
            System.out.print(v[i]);
        }
        System.out.println(aux%2);
    }
}