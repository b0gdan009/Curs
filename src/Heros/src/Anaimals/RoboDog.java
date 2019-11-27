package src.Heros.src.Anaimals;

public class RoboDog implements Animal, Pet, Robot {
protected int battery= 50;
    @Override
    public void makeNoise() {
        System.out.println("Barkzz");
    }

    @Override
    public void play() {
        System.out.println("Jetpack Backfilp");
    }

    @Override
    public void recharge() {
battery = 100;
    }
}
