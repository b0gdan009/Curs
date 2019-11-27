package src.Heros.src.src.Heros;

public class Thanatos extends Hero {
    public Thanatos(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    protected void firePrimary(Hero hero) {
        mana-=25;
        hp++;
        hero.receiveHit(20);
    }

    @Override
    protected void fireSecondary(Hero hero) {
        mana-=50;
        hero.receiveHit(60);
    }

    @Override
    protected void receiveHit(int power) {
        if (power < 25){
            mana+= 5;
        }else{
         hp-= power  / 3;
        }
        hp--;

    }
}
