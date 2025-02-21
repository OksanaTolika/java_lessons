public class Dog extends Animal {

    public static int dogCount = 0;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        dogCount++;
    }

    @Override
    public String run(int distance) {
        if (distance <= maxRunDistance) {
            return name + " пробежал " + distance + " метров.";
        } else {
            return name + " пробежал " + maxRunDistance + " метров и устал.";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance <= maxSwimDistance) {
            return name + " проплыл " + distance + " метров.";
        } else {
            return name + " проплыл " + maxSwimDistance + " метров и устал.";
        }
    }
}
