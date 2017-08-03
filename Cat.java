
public class Cat
{
    private double originWeight; // изначальный вес
    private double weight;
    private double foodAmount;
    private double minWeight;
    private double maxWeight;
    private static int counter;
    private String name;

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public static int getCount() {
        return counter;
    }

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        counter++;
    }

    public Cat(double weight) {
        setWeight(weight);
        counter++;
    }

    // set weight method
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

      //toilet method
    public void toilet() {
        setWeight(weight - 20);
        System.out.println("Don't forget to splash!");
    }

     public static double getWeightDifference(Cat cat1, Cat cat2) {
        double difference = Math.abs(cat1.getWeight() - cat2.getWeight());
        return difference;
    }

    public void meow() {
        setWeight(weight - 1);
        System.out.println("Meow");
    }

    public void meow(double weight) {
        setWeight(this.weight - weight);
        System.out.println("Meow");
    }

    public void feed(double amount) {
        weight = weight + amount;
        foodAmount = amount;
    }

    public double getFoodAmount() {
        return foodAmount;
    }

    public void drink(double amount) {
        weight = weight + amount;
    }

    public String getStatus() {
        if(weight < minWeight) {
            counter--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            counter--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}