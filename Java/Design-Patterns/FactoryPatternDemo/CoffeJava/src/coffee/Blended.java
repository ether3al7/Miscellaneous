package coffee;


//How to create the coffee order
public class Blended implements Coffee {
    private final String flavor;

    public Blended(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void prepare() {
        System.out.println("\nPreparing Hot coffee with " + flavor + " flavor...\n");
    }

    @Override
    public void make() {
        System.out.println("Making the brew to satisfy the soul with " + flavor + " flavor...\n");
    }

    @Override
    public void serve() {
        System.out.println("Now serving Hot coffee with " + flavor + " flavor...\n");
    }
}

