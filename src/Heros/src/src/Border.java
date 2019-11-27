package src.Heros.src.src;

import java.util.Scanner;

public class Border {
    public static void main(String[] args) {
        Scanner reder = new Scanner(System.in);
        System.out.println("lini : ");
        int h = reder.nextInt();
        System.out.println("coloane");
        int w=reder.nextInt();
       for ( int i=0;i<h;i++){
           for (int j=0 ;j<w;j++);{
               System.out.print("0");
           }
           System.out.println();

        }
    }

}
