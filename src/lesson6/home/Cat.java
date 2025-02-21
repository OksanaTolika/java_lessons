public class Cat extends Animal {

    public static int catCount = 0;

    public Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        catCount++;
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
        return name + " не умеет плавать.";
    }
}
