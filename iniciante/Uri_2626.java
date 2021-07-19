package iniciante;

import java.util.Scanner;

public class Uri_2626 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String d = scan.next();
            String l = scan.next();
            String p = scan.next();

            if((d.equals("papel") & l.equals("pedra") & p.equals("pedra")) || (d.equals("tesoura") & l.equals("papel") & p.equals("papel")) || (d.equals("pedra") & l.equals("tesoura") & p.equals("tesoura"))){
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            }else if((l.equals("papel") & d.equals("pedra") & p.equals("pedra")) || (l.equals("tesoura") & d.equals("papel") & p.equals("papel")) || (l.equals("pedra") & d.equals("tesoura") & p.equals("tesoura"))){
                System.out.println("Iron Maiden's gonna get you, no matter how far!" );
            }else if((p.equals("papel") & d.equals("pedra") & l.equals("pedra")) || (p.equals("tesoura") & d.equals("papel") & l.equals("papel")) || (p.equals("pedra") & d.equals("tesoura") & l.equals("tesoura"))){
                System.out.println("Urano perdeu algo muito precioso...");
            }else{
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            }
        }
    }
}
