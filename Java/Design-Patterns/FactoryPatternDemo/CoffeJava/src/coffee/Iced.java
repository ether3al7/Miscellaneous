package coffee;


//How to create the coffee order
public class Iced implements Coffee {
    private final String flavor;

    public Iced(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void prepare() {
        System.out.println("\nPreparing Iced coffee with " + flavor + " flavor...\n");
    }

    @Override
    public void make() {
        System.out.println("Making the brew to satisfy the soul with " + flavor + " flavor...\n");
    }

    @Override
    public void serve() {
        System.out.println("Now serving the Iced nectar of the God's coffee with " + flavor + " flavor...\n");
    }
}

