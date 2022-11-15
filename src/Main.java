import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

               Shark shark = new Shark("Shark", "White", 12);
               Shark shark1= new Shark("Shark1", "Blue", 13);
               Turtle turtle= new Turtle("Turtle", "Black", 11);
               Turtle turtle1= new Turtle("Turtle1", "Brown", 15);
               Eagle eagle= new Eagle("Eagle", "Orange", 14);
               Eagle eagle1= new Eagle("Eagle1", "Black", 10);

        Animal [] animals = {shark,shark1,turtle1,turtle,eagle,eagle1};
        Shark[] sharks = {shark,shark1};
        Eagle[] eagles = {eagle,eagle1};
        Turtle[] turtles = {turtle,turtle1};

        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(eagles));
        System.out.println(Arrays.toString(turtles));


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