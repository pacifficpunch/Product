package lesson3;

public class Product {
    private String name;
    private String dateProduction;
    private String manufacturer;
    private String сountryOfOrigin;
    private double price;
    private boolean bookedByTheBuyer;

    public Product(String name, String dateProduction, String manufacturer,
                   String сountryOfOrigin, double price, boolean bookedByTheBuyer) {
        this.name = name;
        this.dateProduction = dateProduction;
        this.manufacturer = manufacturer;
        this.сountryOfOrigin = сountryOfOrigin;
        this.price = price;
        this.bookedByTheBuyer = bookedByTheBuyer;
    }
    public void getInformation() {
        System.out.println("Название товара: " + name);
        System.out.println("Дата производства: " + dateProduction);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + сountryOfOrigin);
        System.out.println("Цена: " + price);
        if (bookedByTheBuyer) {
            System.out.println("Забронирован покупателем.");
        } else {
            System.out.println("Не забронирован.");
        }
    }
    public static void main(String[] args) {
        Product products = new Product(
                "Кубанская бурёнка",
                "01-01-2025",
                "ООО Молочко",
                "Россия",
                94.0,
                true
        );

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Веселый молочник", "01-02-2025", "ООО Завтра", "Россия", 100.0, false);
        productsArray[1] = new Product("Веселый молочник","01-02-2025","ООО Завтра","Россия",100.0,false);
        productsArray[2] = new Product("Веселый молочник","01-02-2025","ООО Завтра","Россия",100.0,false);
        productsArray[3] = new Product("Веселый молочник","01-02-2025","ООО Завтра","Россия",100.0,false);
        productsArray[4] = new Product("Веселый молочник","01-02-2025","ООО Завтра","Россия",100.0,false);

    }


}

