package factory;
import coffee.Coffee;

// Just knows how just knows how to operate on the instance
public interface CoffeeShopFactory {
    Coffee createCoffee(String flavor);
}

