package iniciante;

import java.util.Scanner;

public class Uri_1114 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senhaP = 2002, senha;
        boolean acesso = false;
        while(!acesso){
            senha = scan.nextInt();
            if(senha != senhaP){
                System.out.println("Senha Invalida");
            }else{
                System.out.println("Acesso Permitido");
                acesso = true;
            }
        }
    }
}
