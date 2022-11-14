public class Shark extends Animal{
    public Shark(String name,String color, int age) {
        super(name,color, age);
    }

    public void attack (){
        System.out.println("Attack ");
}

    @Override
    public void getMethod() {
        attack();
    }
}
