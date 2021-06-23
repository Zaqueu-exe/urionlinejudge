package iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1186 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double[][] m = new double[12][12];
        double soma = 0;
        int cont = 0, aux = m.length;
        char o = scan.next().charAt(0);
        for(int i = 0; i < m.length; i++){
            for(int a = 0; a < m[i].length; a++){
                m[i][a] = scan.nextDouble();
                if(!(a <= aux - 1)){
                    soma += m[i][a];
                    cont++;

                }
            }
            aux--;
        }
        if(o == 'S'){
            System.out.println(df.format(soma));
        }else{
            System.out.println(df.format(soma/cont));
        }
    }
}
