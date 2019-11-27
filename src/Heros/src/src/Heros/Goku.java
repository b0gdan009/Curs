package src.Heros.src.src.Heros;

public class Goku extends Hero {

    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    protected void firePrimary(Hero hero) {
        mana -=5;
        hero.receiveHit(5);
    }


    @Override
    protected void fireSecondary(Hero hero) {
        mana-=40;
        hero.receiveHit(30);

    }

    @Override
    protected void receiveHit(int power ) {
        hp -=power / 2;
        mana +=3;
    }
}
