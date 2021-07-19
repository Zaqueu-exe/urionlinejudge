package iniciante;

import java.util.Scanner;

public class Uri_2551 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String aux = scan.nextLine();
            while (aux.equals("")) {
                aux = scan.nextLine();
            }
            float m = 0f;
            int aux2 = 0, cot = 0;
            int n = Integer.parseInt(aux);
            int[] di = new int[n];
            while (n > cot) {
                cot++;
                aux = scan.nextLine();
                while (aux.equals("")) {
                    aux = scan.nextLine();
                }
                String[] aux1 = aux.split(" ");
                float t = Float.parseFloat(aux1[0]);
                float d = Float.parseFloat(aux1[1]);
                if(m < d/t){
                    m = d/t;
                    di[aux2] = cot;
                    aux2++;
                }
            }
            for(int i = 0; i < aux2; i++){
                System.out.println(di[i]);
            }
        }
    }
}
