public class LaunchClassHomework6 {
    public static void main(String[] args) {

        Dog bobik = new Dog("Бобик");
        Cat barsik = new Cat("Барсик");
        Dog volchok = new Dog("Волчок");

        System.out.println(bobik.run(150));
        System.out.println(bobik.swim(201));

        System.out.println(barsik.run(199));
        System.out.println(barsik.swim(1));

        System.out.println(volchok.run(510));
        System.out.println(volchok.swim(1));

        System.out.println("Animal count: " + Animal.animalCount);
        System.out.println("Dog count: " + Dog.dogCount);
        System.out.println("Cat count: " + Cat.catCount);
    }
}
