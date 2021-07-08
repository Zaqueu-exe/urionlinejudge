package iniciante;

import java.util.Scanner;

public class Uri_2139 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] mes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 25};
        int m = 0;
        int d = 0;
        int qtd = 0;
        while(scan.hasNext()){
            try{
                m = scan.nextInt();
                d = scan.nextInt();
            }catch(Exception e){
                System.exit(0);
            }
            if(m == 12 & d == 25){
                System.out.println("E natal!");
            }else if(m == 12 & d == 24){
                System.out.println("E vespera de natal!");
            }else if(m == 12 & d > 26){
                System.out.println("Ja passou!");
            }else{
                for(int i = m-1; i < mes.length; i++){
                    qtd = qtd + mes[i];
                }
                System.out.println("Faltam " + (qtd-d) + " dias para o natal!");
            }
            qtd = 0;
        }
    }
}
