public class Cat extends Animal {

    private static final double maxRunDistance = 200;
    public static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public String run(double distance) {
        if (distance <= maxRunDistance) {
            return name + " пробежал " + distance + " метров.";
        } else {
            return name + " пробежал " + maxRunDistance + " метров и устал.";
        }
    }

    @Override
    public String swim(double distance) {
        return name + " не умеет плавать.";
    }
}
