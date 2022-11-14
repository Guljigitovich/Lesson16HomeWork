public class Turtle extends Animal{
    public Turtle(String name,String color, int age) {
        super(name,color, age);
    }

    public void swim (){
        System.out.println("Swim");
}

    @Override
    public void getMethod (){
        swim();
    }
}
