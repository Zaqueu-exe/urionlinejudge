package iniciante;

import java.text.DecimalFormat;

public class Uri_1098 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        DecimalFormat df1 = new DecimalFormat("0");
        double p = 0;
        for(int a = 0; a < 11; a++){
            for(int i = 1; i <= 3; i++){
                if(a % 5 == 0){
                    System.out.println("I=" + df1.format((p)) + " J=" + df1.format((i+p)));
                }else{
                    System.out.println("I=" + df.format((p)) + " J=" + df.format((i+p)));
                }
            }
            p = p + 0.2;
        }
    }
}
