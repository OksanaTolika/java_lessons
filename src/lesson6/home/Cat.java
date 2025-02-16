public class Cat extends Animal {

    public static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public String run(double distance) {
        if (distance <= 200) {
            return name + " пробежал " + distance + " метров.";
        } else {
            return name + " пробежал 200 метров и устал.";
        }
    }

    @Override
    public String swim(double distance) {
        return name + " не умеет плавать.";
    }
}
