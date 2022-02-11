package iniciante;
import java.util.Scanner;

public class Uri_2774 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int h = scan.nextInt();
            int m = scan.nextInt();
            int qt = h * 60 / m;
            double[] v = new double[qt];
            double media = 0.0;
            double soma = 0.0;
            for (int i = 0; i < v.length; i++) {
                v[i] = scan.nextDouble();
                media += v[i];
            }
            media = media / v.length;
            for (int i = 0; i < v.length; i++) {
                soma += Math.pow(v[i] - media, 2);
            }
            Double aux =  Math.sqrt(soma / (v.length - 1));
            System.out.printf("%.5f",aux);
            System.out.println();
        }
        
    }
}