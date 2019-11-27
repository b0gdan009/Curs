package src.Heros.src.src.Heros;

public class Game {
    public static void main(String[] args) {
        Goku hero1 = new Goku("Goku",400,200);
        Mage hero2 = new Mage("China",200,200);
        Thanatos hero3= new Thanatos("Awilix",500,300);

        hero1.firePrimary(hero2);
        hero1.firePrimary(hero2);;
        hero2.fireSecondary(hero1);
        hero1.firePrimary(hero1);
        hero1.fireSecondary(hero3);

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
    }
}
