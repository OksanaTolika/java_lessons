public class Cat extends Animal {

    public static int catCount = 0;

    public Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        catCount++;
    }

    @Override
    public String swim(int distance) {
        return name + " не умеет плавать.";
    }
}
