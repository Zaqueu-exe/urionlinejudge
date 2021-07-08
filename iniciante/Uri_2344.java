package iniciante;

import java.util.Scanner;

public class Uri_2344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(nota(n));
    }
    public static char nota(int n){
        char nota;
        if(n == 0){
            nota = 'E';
        }else if(n <= 35){
            nota = 'D';
        }else if(n <= 60){
            nota = 'C';
        }else if(n <= 85){
            nota = 'B';
        }else{
            nota = 'A';
        }
        return nota;
    }
}
