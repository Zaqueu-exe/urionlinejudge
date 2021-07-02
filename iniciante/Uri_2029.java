package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_2029 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v = 0, d = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        while(scan.hasNext()){
            try{
                v = scan.nextDouble();
                d = scan.nextDouble();
            }catch(Exception e){
                System.exit(0);
            }
            Double area = ((d/2)*(d/2))*3.14;
            Double alt = (v/area);
            System.out.println("ALTURA = " + df.format(alt));
            System.out.println("AREA = "+ df.format(area));
        }
    }
}
