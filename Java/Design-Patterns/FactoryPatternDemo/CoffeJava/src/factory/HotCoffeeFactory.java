package factory;

import coffee.Coffee;
import coffee.Hot;

public class HotCoffeeFactory implements CoffeeShopFactory{
    @Override
    public Coffee createCoffee(String flavor){
        return new Hot(flavor);
    }
}
