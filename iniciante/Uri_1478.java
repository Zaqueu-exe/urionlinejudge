package iniciante;
import java.util.Scanner;
public class Uri_1478 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int aux;
        do{
            teste(n);
            int[][] m = new int[n][n];
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < m.length; i++){
                for(int y = i; y < m[i].length; y++){
                    m[i][y] = (y+1)-i;
                    m[y][i] = (y+1)-i;
                }
            }
            for(int i = 0; i < m.length; i++){
                if(m[i][0] == 100){
                    str.append("");
                }else if(m[i][0] > 9 & m[i][0] < 100){
                    str.append(" ");
                }else{
                    str.append("  ");
                }
                for(int y = 0; y < m[i].length - 1; y++){
                    if(m[i][y] >= 99 & m[i][y+1] == 100){
                        str.append(m[i][y]+" ");
                    }else if(m[i][y] >= 9 & m[i][y+1] > 9){
                        str.append(m[i][y]+ "  ");
                    }else{
                        str.append(m[i][y]+ "   ");
                    }
                }
                str.append(m[i][m.length-1]+"\n");
            }
            str.append("\n");
            System.out.print(str.toString());
            n = scan.nextInt();
        }while(n != 0);
    }
    public static void teste(int n){
        if(n < 1 || n > 100){
            System.exit(0);
        }
    }
}
