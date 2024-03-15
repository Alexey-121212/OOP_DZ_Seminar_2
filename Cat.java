public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    {
        satiety = false;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= getAppetite()) {
            plate.setFood(plate.getFood() - getAppetite());
            satiety = true;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        String ne = new String();
        if (satiety)
            ne = "не ";
        else
            ne = "";
        return String.format("У кота %s аппетит %d и сейчас он %sголоден", name, appetite, ne);
    }

}
