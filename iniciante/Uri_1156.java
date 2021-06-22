package iniciante;

import java.text.DecimalFormat;

public class Uri_1156 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double s = 0, d = 1, im = 1;
        while(im <= 39){
            s += (im/d);
            d *= 2;
            im += 2;
        }
        System.out.println(df.format(s));
    }
}
