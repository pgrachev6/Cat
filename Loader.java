
public class Loader {

    public static void main(String[] args) {
        //Set weight when creating a cat with help of a second constructor

        Cat alisa = new Cat(1000.0);
        System.out.println(alisa.getWeight());

        //Creating a kitten

        Cat jimmy = getKitten();
        System.out.println(jimmy.getWeight());

        //Creating 5 cats

        Cat dan = new Cat();
        Cat david = new Cat();
        Cat peter = new Cat();
        Cat tim = new Cat();
        Cat ginger = new Cat();

        ginger.setName("WTF you want from me?");
        System.out.println(ginger.getName());

        System.out.println(dan.getWeight());
        System.out.println(david.getWeight());
        System.out.println("difference: " + Cat.getWeightDifference(dan, david));

        // All cats weight check

        System.out.println(peter.getWeight());
        System.out.println(tim.getWeight());
        System.out.println(ginger.getWeight());

        // Feeding cat tim

        tim.feed(1000.0);
        System.out.println(tim.getStatus());

        // Cat david overfeeding and checking food amount

        dan.feed(8000.0);
        System.out.println(dan.getFoodAmount());
        System.out.println(dan.getStatus());


        // Meowing cat ginger till the death

        do {
            ginger.meow();
        } while (ginger.getWeight() > 1000.0);

        System.out.println(ginger.getStatus());

        //Getting cats number, including death or exploding
        System.out.println("Number of cats: " + Cat.getCount());
    }

    // kitten creation method
    public static Cat getKitten() {
        Double randomWeight = 100.0 + 100.0 * Math.random();
        Cat cat = new Cat(randomWeight);
        return cat;
    }
}
