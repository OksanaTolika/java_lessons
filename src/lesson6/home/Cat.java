public class Cat extends Animal {

    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(double distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " пробежал 200 метров и устал.");
        }
    }

    @Override
    public void swim(double distance) {
        System.out.println(name + " не умеет плавать.");
    }
}
