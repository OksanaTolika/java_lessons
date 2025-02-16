public class LaunchClassHomework6 {
    public static void main(String[] args) {

        Dog bobik = new Dog("Бобик");
        Cat barsik = new Cat("Барсик");
        Dog volchok = new Dog("Волчок");

        bobik.run(150);
        bobik.swim(201);

        barsik.run(199);
        barsik.swim(1);

        volchok.run(510);
        volchok.swim(1);

        System.out.println("Animal count: " + Animal.getAnimalCount());
        System.out.println("Dog count: " + Dog.getDogCount());
        System.out.println("Cat count: " + Cat.getCatCount());
    }
}
