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
        switch (magia) {
            case "fire": {
                dano = 200;
                switch (n) {
                    case 1: {
                        alcance = 20;
                    }
                        break;
                    case 2: {
                        alcance = 30;
                    }
                        break;
                    case 3: {
                        alcance = 50;
                    }
                        break;
                }
            }
                break;
            case "water": {
                dano = 300;
                switch (n) {
                    case 1: {
                        alcance = 10;
                    }
                        break;
                    case 2: {
                        alcance = 25;
                    }
                        break;
                    case 3: {
                        alcance = 40;
                    }
                        break;
                }
            }
                break;
            case "earth": {
                dano = 400;
                switch (n) {
                    case 1: {
                        alcance = 25;
                    }
                        break;
                    case 2: {
                        alcance = 55;
                    }
                        break;
                    case 3: {
                        alcance = 70;
                    }
                        break;
                }
            }
                break;
            case "air": {
                dano = 100;
                switch (n) {
                    case 1: {
                        alcance = 18;
                    }
                        break;
                    case 2: {
                        alcance = 38;
                    }
                        break;
                    case 3: {
                        alcance = 60;
                    }
                        break;
                }
            }
                break;
        }
        return dano + alcance;
    }

    public static double comparaD(int x0, int y0, int cx, int cy, int w, int h) {
       /* double distancia = 9999999;
        double[] aux = new double[6];
        aux[0] = Math.sqrt(Math.pow((x0 - cx) + w, 2) + Math.pow((y0 - cy) + h, 2));
        aux[1] = Math.sqrt(Math.pow((x0 - cx) + w, 2) + Math.pow((y0 - cy), 2));
        aux[2] = Math.sqrt(Math.pow((x0 - cx), 2) + Math.pow((y0 - cy) + h, 2));
        aux[3] = Math.sqrt(Math.pow((x0 - cx), 2) + Math.pow((y0 - cy), 2));

        if (x0 <= cx && (x0 + w) >= cx) {
            aux[4] = (y0 + h) - cy;
        } else if (y0 <= cy && (y0 + h) >= cy) {
            aux[4] = (x0 + w) - cx;
        } else if ((x0 >= cx) && (y0 <= cy) && (y0 + h) >= cy) {
            aux[4] = x0 - cx;
        }else if(y0 >= cy && x0 <= cx && (x0 + w) >= cx){
            aux[4] = y0 - cy;
        }
        if (x0 <= cx && (x0 + w) >= cx) {
            aux[5] = y0 - cy;
        } else if (y0 <= cy && (y0 + h) >= cy) {
            aux[5] = x0 - cx;
        } else if (x0 >= cx && y0 <= cy && (y0 + h) >= cy) {
            aux[5] = (x0+w) - cx;
        }else if(y0 >= cy && x0 <= cx && (x0 + w) >= cx){
            aux[5] = (y0+h) - cy;
        }
        aux[4] = Math.abs(aux[4]); 
        aux[5] = Math.abs(aux[5]); 

        for (int i = 0; i < 6; i++) {
            System.out.println(aux[i] + "==========");
            if (aux[i] < distancia) {
                distancia = aux[i];
            }
        }*/
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