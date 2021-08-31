package iniciante;

import java.util.Scanner;

public class Uri_2721 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        int n5 = scan.nextInt();
        int n6 = scan.nextInt();
        int n7 = scan.nextInt();
        int n8 = scan.nextInt();
        int n9 = scan.nextInt();
        int tt = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
        tt %=9;
        switch(tt){
            case 1:{ System.out.println("Dasher");
            }break;
            case 2:{ System.out.println("Dancer");
            }break;
            case 3:{ System.out.println("Prancer");
            }break;
            case 4:{ System.out.println("Vixen");
            }break;
            case 5:{ System.out.println("Comet");
            }break;
            case 6:{ System.out.println("Cupid");
            }break;
            case 7:{ System.out.println("Donner");
            }break;
            case 8:{ System.out.println("Blitzen");
            }break;
            case 0:{ System.out.println("Rudolph");
            }break;
        }
    }
}
