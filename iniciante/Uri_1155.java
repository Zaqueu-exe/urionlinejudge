package iniciante;

import java.text.DecimalFormat;

public class Uri_1155 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double s = 0, div = 1.00;
        for(int i = 1; i <= 100; i++){
            s += (1.00/div);
            div += 1.00;
        }
        System.out.println(df.format(s));
    }
}
