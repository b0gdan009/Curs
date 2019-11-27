package src.Heros.src.src.Heros;

public class Mage extends Hero {

    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    protected void firePrimary(Hero hero) {
        mana -=15;
        hero.receiveHit(20);
    }

    @Override
    protected void fireSecondary(Hero hero) {
        mana -=40;
        hero.receiveHit(40);
    }

    @Override
    protected void receiveHit(int power) {
        hp -= 2* power;

    }
}
