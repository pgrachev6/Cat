
public class Loader
{
    public static void main(String[] args)
    {
        Cat dan = new Cat();
        Cat david = new Cat();
        Cat peter = new Cat();
        Cat tim = new Cat();
        Cat ginger = new Cat();

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

        //Getting cats number after death or exploding
        System.out.println("Number of cats are: " + Cat.getCount());





















    }
}