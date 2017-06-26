
public class Loader
{
    public static void main(String[] args)
    {
        Cat dan = new Cat();
        Cat david = new Cat();
        Cat peter = new Cat();
        Cat tim = new Cat();
        Cat ginger = new Cat();

        // All cats weight check

        System.out.println(dan.getWeight());
        System.out.println(david.getWeight());
        System.out.println(peter.getWeight());
        System.out.println(tim.getWeight());
        System.out.println(ginger.getWeight());

        // Feeding cat tim

        tim.feed(1000.0);
        System.out.println(tim.getStatus());

        // Cat david overfeeding

        dan.feed(8000.0);
        System.out.println(dan.getStatus());

        // Meowing cat ginger till the death

        do {
            ginger.meow();
        } while (ginger.getWeight() > 0);

        System.out.println(ginger.getStatus());



















    }
}