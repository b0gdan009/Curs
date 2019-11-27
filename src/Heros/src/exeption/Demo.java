package src.Heros.src.exeption;

public class Demo {
    public static void main(String[] args) {
        int y=10;
        try {
            y=5;
            int a = 1 / 0;
            System.out.println(a);
        } catch(Exception e ){
            System.out.println("Nu mere nene");

        }
        System.out.println(y);

    }
}
