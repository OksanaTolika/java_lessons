public class Dog extends Animal {

    private static final double maxRunDistance = 500;
    private static final double maxSwimDistance = 10;

    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
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
        if (distance <= maxSwimDistance) {
            return name + " проплыл " + distance + " метров.";
        } else {
            return name + " проплыл " + maxSwimDistance + " метров и устал.";
        }
    }
}
