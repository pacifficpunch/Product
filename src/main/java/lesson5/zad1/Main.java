package lesson5.zad1;

public class Main {
    public static void main(String[] args) {
        Dog dogSharic = new Dog("Шарик");
        Cat catMatriscin = new Cat("Матроскин");

        int minValue = 1;
        int maxValue = 500;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));

        dogSharic.run(randomValue);
        dogSharic.swim(5);

        catMatriscin.run(randomValue);
        catMatriscin.swim(randomValue);

        System.out.println("Количество созданных животных: " + Animal.count);
        System.out.println("Количество созданных кошек: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("----------------------");

        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот " + (i + 1));
        }

        Bowl bowl = new Bowl(45);

        for (int i = 0; i < cats.length; i++) {
            int foodTaken = bowl.getFood(10);
            cats[i].eat(foodTaken);
            if (i < cats.length - 1) {
                System.out.print("\nОсталось в миске " + bowl.FoodAmount() + " --> ");
            }
        }

        for (Cat cat : cats) {
            if (cat.fullness) {
                System.out.println(cat.name + " сыт.");
            } else {
                System.out.println(cat.name + " голоден.");
            }

        }

        catMatriscin.eat(bowl.getFood(15));
        System.out.println("Осталось в миске " + bowl.FoodAmount());
        bowl.addFood(10);
        catMatriscin.eat(bowl.getFood(10));
    }
}
