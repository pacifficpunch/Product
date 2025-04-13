package lesson5.zad1;

public class Cat extends Animal {
    int MAX_RUN_DISTANCE = 200;
    private static int CatCount = 0;
    boolean  fullness;

    public Cat(String name) {
        super(name);
        CatCount++;
    }
    @Override
    public void run(int lenght) {
        if (lenght >= MAX_RUN_DISTANCE ) {
            System.out.println(name + " не может пробежать " + lenght + " м.");
        } else {
            System.out.println(name + " пробежал " + lenght + " м.");
        }
    }

    @Override
    public void swim(int lenght) {
        System.out.println(name + " не умеет плавать" );
    }

    public static int getCatCount() {
        return CatCount;
    }

    public void eat(int foodAmount) {
        if (foodAmount > 0 ) {
            fullness = true;
            System.out.print(name + " поел из миски.");
        } else {
            fullness = false;
            System.out.println(name + " не хватило еды в миске, поэтому не поел.");
        }
    }
}
