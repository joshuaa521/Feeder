public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        f.simulateOneDay(12);
        System.out.println(f.getCurrentFood() + " grams");

        f = new Feeder(1000);
        f.simulateOneDay(22);
        System.out.println(f.getCurrentFood() + " grams");

        f = new Feeder(100);
        f.simulateOneDay(5);
        System.out.println(f.getCurrentFood() + " grams");

        f = new Feeder(2400);
        System.out.println(f.simulateManyDays(10, 4) + " grams");

        f = new Feeder(250);
        System.out.println(f.simulateManyDays(10,5) + " day(s)");
        f = new Feeder(0);
        System.out.println(f.simulateManyDays(5,10) + " day(s)");


    }
}
