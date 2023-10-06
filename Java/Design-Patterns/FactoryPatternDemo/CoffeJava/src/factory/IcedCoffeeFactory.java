package factory;

import coffee.Coffee;
import coffee.Iced;

public class IcedCoffeeFactory implements CoffeeShopFactory{
    @Override
    public Coffee createCoffee(String flavor){
        return new Iced(flavor);
    }
}
