package coffee;


//How to create the coffee order
public class Hot implements Coffee {

    private final String flavor;

    public Hot(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void prepare() {
        System.out.println("\nPreparing Hot coffee with " + flavor + " flavor...\n");
    }

    @Override
    public void make() {
        System.out.println("Making Hot coffee with " + flavor + " flavor...\n");
    }

    @Override
    public void serve() {
        System.out.println("Now serving too Hot to handle coffee with " + flavor + " flavor...\n");
    }

}
