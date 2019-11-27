package src.Heros.src.Anaimals;

public class VetProgram {
    public static void main(String[] args) {
        Bear winnie = new Bear();
        Lion simba = new Lion();
        Chiken KFC= new Chiken();
        RoboDog foca= new RoboDog();
        Vet marcel= new Vet();

        marcel.makeShot(simba);
        marcel.makeShot(KFC);
        marcel.makeShot(winnie);
        marcel.makeShot(foca);
        foca.recharge();

    }
}
