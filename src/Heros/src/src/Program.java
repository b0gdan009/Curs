package src.Heros.src.src;

public class Program {
    public static void main(String[] args) {
        Person alex = new Person("alexandru",20,175, 10);

        student andrei= new student("Andrei",25,180,100,"A" );
        if(andrei instanceof Person){
            System.out.println(andrei.getName()+" este student");
        }
        student s= (student)andrei;
        System.out.println();
        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());
        alex.name = "Alexandru";

        alex.age = 20;
        alex.height = 175;
        alex.age++;
        alex.stamina= 10;

        System.out.println(alex.name + " are "  + "de ani");
        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.name + " are energia "+ alex.stamina);
    }
}
