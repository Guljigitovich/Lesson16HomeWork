public class Eagle extends Animal{
    public Eagle(String name,String color, int age) {
        super(name,color, age);
    }

    public void fly (){
        System.out.println("Fly");
}

    @Override
    public void getMethod () {
        fly();
    }
}
