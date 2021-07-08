package iniciante;

import java.math.BigInteger;
import java.util.Scanner;

public class Uri_2334 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger negativo = new BigInteger("-1");
        BigInteger positivo = new BigInteger("1");
        BigInteger neutro = new BigInteger("0");
        BigInteger p = scan.nextBigInteger();
        boolean aux;
        do{
            if(p.equals(neutro)){
                System.out.println(0);
            }else{
                System.out.println(p.subtract(positivo));
            }
            p = scan.nextBigInteger();
            aux = p.equals(negativo);
        }while(aux == false);
    }
}
