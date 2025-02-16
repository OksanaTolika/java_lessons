public class Dog extends Animal {

    public static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public String run(double distance) {
        if (distance <= 500) {
            return name + " пробежал " + distance + " метров.";
        } else {
            return name + " пробежал 500 метров и устал.";
        }
    }

    @Override
    public String swim(double distance) {
        if (distance <= 10) {
            return name + " проплыл " + distance + " метров.";
        } else {
            return name + " проплыл 10 метров и устал.";
        }
    }
}
