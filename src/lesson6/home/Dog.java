public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(double distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " пробежал 500 метров и устал.");
        }
    }

    @Override
    public void swim(double distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(name + " проплыл 10 метров и устал.");
        }
    }
}
