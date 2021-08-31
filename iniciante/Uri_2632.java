package iniciante;

import java.util.Scanner;

public class Uri_2632 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int auxD, auxA;
            int w = scan.nextInt();
            int h = scan.nextInt();
            int x0 = scan.nextInt();
            int y0 = scan.nextInt();
            String magia = scan.next();
            int n = scan.nextInt();
            int cx = scan.nextInt();
            int cy = scan.nextInt();

            auxA = resultado(magia, n) % 100;
            auxD = resultado(magia, n) - auxA;
            double dis = comparaD(x0, y0, cx, cy, w, h);
            if (dis <= auxA) {
                System.out.println(auxD);
            } else {
                System.out.println(0);
            }

        }
    }

    public static int resultado(String magia, int n) {
        int alcance = 0, dano = 0; 
        if (magia.equals("fire")) {
            dano = 200;
            if (n == 1) {
                alcance = 20;
            } else if (n == 2) {
                alcance = 30;
            } else {
                alcance = 50;
            }
        } else if (magia.equals("water")) {
            dano = 300;
            if (n == 1) {
                alcance = 10;
            } else if (n == 2) {
                alcance = 25;
            } else {
                alcance = 40;
            }
        } else if (magia.equals("earth")) {
            dano = 400;
            if (n == 1) {
                alcance = 25;
            } else if (n == 2) {
                alcance = 55;
            } else {
                alcance = 70;
            }
        } else {
            dano = 100;
            if (n == 1) {
                alcance = 18;
            } else if (n == 2) {
                alcance = 38;
            } else {
                alcance = 60;
            }
        }
        return dano + alcance;
    }

    public static double comparaD(int x0, int y0, int cx, int cy, int w, int h) {
        double distancia = 0;
        double x = cx;
        double y = cy;
        if(cx < x0){
            x = x0;
        }else if(cx > (x0 + w)){
            x = x0+w;
        }
        if(cy < y0){
            y = y0;
        }else if(cy > (y0 + h)){
            y = y0+h;
        }
        double distX = cx - x;
        double distY = cy - y;
        distancia = Math.sqrt((distX*distX) + (distY*distY));

        return distancia;
    }
}
