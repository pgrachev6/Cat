
public class Cat
{
    private double originWeight; // изначальный вес
    private double weight;
    private double foodAmount;
    private double minWeight;
    private double maxWeight;
    public static int counter;
    private String name;

    public Cat() {
        this(1500 + 3000 * Math.random());
}

    //cat creation constructor where you can set a weight
    public Cat(double weight) {
        this(weight, weight, 100, 9000, 0);
    }

    public Cat(double weight, double originWeight, double minWeight, double maxWeight, double foodAmount) {
        this.weight = weight ;
        this.originWeight = originWeight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.foodAmount = foodAmount;
        if(isAlive())
            counter++;
    }

    //copy constructor
    public Cat(Cat copy) {
        this(copy.weight, copy.originWeight, copy.minWeight, copy.maxWeight, copy.getFoodAmount());
    }

    public Cat twin() {
        return new Cat(this);
    }

        public static Cat twin(Cat copy) {
        return copy.twin();
    }

    // set weight method
    private void setWeight(double weight) {
        if (isAlive()) {
        }
        this.weight = weight;
        if (!isAlive()) {
            counter--;
        }
    }

    private void addWeight(double weight) {
        setWeight(getWeight() + weight);
    }

    public double getWeight() {
        return weight;
    }

    private void setFoodAmount(double foodAmount) {
        this.foodAmount = foodAmount;
    }

    private void addFoodAmount(double foodAmount) {
        setFoodAmount(getFoodAmount() + foodAmount);
    }

    public double getFoodAmount() {
        return foodAmount;
    }

    public void feed(double amount) {
        addWeight(amount);
        addFoodAmount(amount);
    }


    public String getName() {
        return name;
    }

    public double getOriginWeight() {
        return originWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return counter;
    }

      //toilet method
    public void toilet() {
        if (isAlive()) {
            addWeight(-20);
            System.out.println("Don't forget to splash!");
        }
    }

    public static double getWeightDifference(Cat cat1, Cat cat2) {
        double difference = Math.abs(cat1.getWeight() - cat2.getWeight());
        return difference;
    }

    public void meow() {
        if (isAlive()) {
            addWeight(-100);
            System.out.println("Meow");
        }
    }

    public void meow(double weight) {
        if (isAlive()) {
            addWeight(-weight);
            System.out.println("Meow");
        }
    }

    public void drink(double amount) {
        if (isAlive()) {
            addWeight(amount);
        }
    }

    public String getStatus() {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public boolean isAlive() {
        return getWeight() >= minWeight && getWeight() <= maxWeight;
    }
}