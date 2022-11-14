import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Shark("Shark", "White", 12),
                new Shark("Shark1", "Blue", 13),
                new Turtle("Turtle", "Black", 11),
                new Turtle("Turtle1", "Brown", 15),
                new Eagle("Eagle", "Orange", 14),
                new Eagle("Eagle1", "Black", 10)
        };
        Shark[] sharks = new Shark[2];
        Eagle[] eagles = new Eagle[2];
        Turtle[] turtles = new Turtle[2];
        

        for (Animal massive : animals) {
            System.out.println(massive);
            if (massive.getClass().equals(Shark.class)) {
                massive.getMethod();
            }
            if (massive.getClass().equals(Eagle.class)) {
                massive.getMethod();
            }
            if (massive.getClass().equals(Turtle.class)) {
                massive.getMethod();

        }

        }

    }
}