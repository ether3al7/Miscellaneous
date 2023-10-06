package factory;

import coffee.Blended;
import coffee.Coffee;

public class BlendedCoffeeFactory implements CoffeeShopFactory {
    @Override
    public Coffee createCoffee(String flavor){
        return new Blended(flavor);
    }
}
