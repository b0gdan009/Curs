package src.Heros.src.src;

public class student extends Person {
   private String ClassGroup;

    public String getClassGroup() {
        return ClassGroup;
    }

    public String toString() {
        return "student{" +
                "ClassGroup='" + ClassGroup + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", stamina=" + stamina +
                '}';
    }

    public student(String name, int age, int height, int stamina, String classGroup) {
        super(name, age, height, stamina);
        ClassGroup = classGroup;

    }
    protected void grow(int size){
        height += size;
    }

}
