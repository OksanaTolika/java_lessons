public abstract class Animal {
    private static int animalCount = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(double distance);

    public abstract void swim(double distance);
}
