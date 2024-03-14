package teste;

import java.util.*;

public class P {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        List<String> dias = new ArrayList<>();
        for (int i = 0; i < numero * 2; i++) {
            dias.add(scan.next());
        }
        int casa = 0, trabalho = 0, casaE = 0, trabalhoE = 0;
        for (int i = 0; i < dias.size(); i++) {
            boolean choveu = dias.get(i).equals("chuva");
            if (i % 2 == 0) {
                if (choveu) {
                    if (casaE > 0) {
                        casaE--;
                        trabalhoE++;
                    } else {
                        casa++;
                        trabalhoE++;
                    }
                }
            } else {
                if (choveu) {
                    if (trabalhoE > 0) {
                        trabalhoE--;
                        casaE++;
                    } else {
                        trabalho++;
                        casaE++;
                    }
                }
            }
        }
        System.out.println(casa + " " + trabalho);
    }
}
