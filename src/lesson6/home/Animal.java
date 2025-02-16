public abstract class Animal {

    public static int animalCount = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public abstract String run(double distance);

    public abstract String swim(double distance);
}
