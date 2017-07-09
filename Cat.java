
public class Cat
{
    private Double originWeight; // изначальный вес
    private Double weight;
    private Double foodAmount;
    private Double minWeight;
    private Double maxWeight;
    private static Integer counter = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        counter++;
    }

    public Cat(Double weight)
    {
        this.weight = weight;
        counter++;
    }

    //Create a twin by the parameters
    public Cat createTwin() {
        this.weight = 1500.0 + 3000.0 * Math.random();
        this.originWeight = weight;
        this.minWeight = 1000.0;
        this.maxWeight = 9000.0;
        counter++;
        Cat cat = new Cat();
        return cat;
    }

    public static Integer getCount()
    {
        return counter;
    }

    public static Double getWeightDifference(Cat cat1, Cat cat2)
    {
        Double difference = Math.abs(cat1.getWeight() - cat2.getWeight());
        return difference;
    }

    //toilet method
    public void toilet()
    {
        weight = weight - 20;
        System.out.println("Don't forget to splash!");
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void meow(Double weight)
    {
        this.weight = this.weight - weight;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        foodAmount = amount;
    }

    public  Double getFoodAmount() { return foodAmount; }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    // set weight method
    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    public String getStatus()
    {
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