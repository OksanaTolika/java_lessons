public class Animal {

    public static int animalCount = 0;

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public String run(int distance) {
        if (distance <= maxRunDistance) {
            return name + " пробежал " + distance + " метров.";
        } else {
            return name + " пробежал " + maxRunDistance + " метров и устал.";
        }
    }

    public String swim(int distance) {
        if (distance <= maxSwimDistance) {
            return name + " проплыл " + distance + " метров.";
        } else {
            return name + " проплыл " + maxSwimDistance + " метров и устал.";
        }
    }
}
