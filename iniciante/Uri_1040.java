package iniciante;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Uri_1040 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        double n1, n2, n3 ,n4, n5, m;
        String a = "a";
        boolean p = false;
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        n4 = scan.nextDouble();
        n1 = n1 * 2;
        n2 = n2 * 3;
        n3 = n3 * 4;
        m = (n1 + n2 + n3 + n4)/10;
        if(m >= 7){
            a = "Aluno aprovado.";
        }else if(m < 5){
            a = "Aluno reprovado.";
        }else if(m >= 5 & m < 7){
            a = "Aluno em exame.";
            p = true;
        }
        System.out.println("Media: "+df.format(m));
        System.out.println(a);

        if(p){
            n5 = scan.nextDouble();
            System.out.println("Nota do exame: "+n5);
            m = (m + n5)/2;
            if(m >= 5){
                a = "Aluno aprovado.";
            }else{
                a = "Aluno reprovado.";
            }
            System.out.println(a);
            System.out.println("Media final: "+df.format(m));
        }
    }
}
