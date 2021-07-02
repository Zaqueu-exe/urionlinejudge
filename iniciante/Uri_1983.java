package iniciante;

import java.util.Scanner;

public class Uri_1983 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double notaM = 7.99, nota;
        int p = 0;
        int[] m = new int[a];
        for(int i = 0; i < m.length; i++){
            m[i] = scan.nextInt();
            nota = scan.nextDouble();
            if(nota > notaM){
                notaM = nota;
                p = i;
            }
        }
        if(notaM >= 8.00){
            System.out.println(m[p]);
        }else{
            System.out.println("Minimum note not reached");
        }
    }
}
