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


/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу
передается длина препятствия. Результатом выполнения действия будет печать в
консоль. Например,dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.

 */