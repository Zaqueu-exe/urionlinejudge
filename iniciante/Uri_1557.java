package iniciante;
import java.util.Scanner;
public class Uri_1557 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n != 0){
            int[][] m = new int[n][n];
            m[0][0] = 1;
            for(int i = 0; i < m.length - 1; i++){
                m[0][i+1] = m[0][i] * 2;
            }
            for(int i = 1; i < m.length; i++){
                for(int p = 0; p < m.length; p++){
                    m[i][p] = m[i-1][p]*2;
                }
            }
            int t = String.valueOf(m[n-1][n-1]).length();
            for(int i = 0; i < m.length; i++){
                for(int p = 0; p < m[i].length; p++){
                    if(p == m.length-1){
                        System.out.printf("%" + t + "d\n", m[i][p]);
                    }else{
                        System.out.printf("%" + t + "d ", m[i][p]);
                    }
                }
            }
            System.out.print("\n");
            n = scan.nextInt();
        }
    }
}
