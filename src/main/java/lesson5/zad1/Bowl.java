package lesson5.zad1;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {

        this.foodAmount = foodAmount;
    }

    public int getFood(int countFood) {
        if (foodAmount >= countFood) {
            foodAmount -= countFood;
            return countFood;
        } else {
            foodAmount = 0;
            return 0;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавили " + amount);
        }
    }

    public int FoodAmount() {
        return foodAmount;
    }

}
