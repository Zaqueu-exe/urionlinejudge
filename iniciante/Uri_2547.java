package iniciante;
import java.util.Scanner;
public class Uri_2547{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            String valores = scan.nextLine();
            while(valores.equals("")){
                valores = scan.nextLine();
            }
            String[] aux = valores.split(" ");
            int n = Integer.parseInt(aux[0]);
            int ami = Integer.parseInt(aux[1]);
            int ama = Integer.parseInt(aux[2]);
            int i = 0;
            while(n > 0){
                n--;
                valores = scan.nextLine();
                while(valores.equals("")){
                    valores = scan.nextLine();
                }
                int a = Integer.parseInt(valores);
                if(a >= ami & a <= ama){
                    i++;
                }
            }
            System.out.println(i);
        }
    }
}
