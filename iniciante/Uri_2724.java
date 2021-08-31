package iniciante;

import java.util.Scanner;

public class Uri_2724 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] aux1 = {"e", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "l"};
        for(int a = 0; a < n; a++){
            int com = scan.nextInt();
            String[] compo = new String[com];
            for(int ab = 0; ab < com; ab++){
                compo[ab] = scan.next();
            }
            int test = scan.nextInt();
            String[] teste = new String[test];
            for(int ab = 0; ab < test; ab++){
                teste[ab] = scan.next();
            }
            for(int i = 0; i < teste.length; i++){
                int aux = 0;
                for(int it = 0; it < compo.length; it++){
                    if(teste[i].contains(compo[it])){
                        aux++;
                        for(int tst = 0; tst < aux1.length; tst++){
                            if(teste[i].contains(compo[it]+aux1[tst])){
                                aux--;
                            }
                        }
                    }
                }
                if(aux != 0){
                    System.out.println("Abortar");
                }else{
                    System.out.println("Prossiga");
                }
            }
            if(a < n-1){
                System.out.println();
            }
        }
    }
}
