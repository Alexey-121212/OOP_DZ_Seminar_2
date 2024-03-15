public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 15),
                new Cat("Vaska", 10)
        };

        Plate plate = new Plate(25);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        plate.info();
        System.out.println("Добавим еды в тарелку");
        plate.addFood(10);
        plate.info();
    }
}