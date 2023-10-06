from abc import ABCMeta, abstractmethod


# ABC: abstract base classes


# build during run time
class ICoffee(metaclass=ABCMeta):

    @staticmethod
    @abstractmethod
    def coffee_method():
        """Interface Method"""


# Inherit and provide concrete implementation of coffee_method
class Hot(ICoffee):
    # constructor to set instance(self) variable
    def __init__(self):
        self.drink = "Basic Drink Name"

    def coffee_method(self):
        print("\nTo Hot to handle, coffee coming your way")


class Iced(ICoffee):

    def __init__(self):
        self.drink = "Chill Brew"

    def coffee_method(self):
        print("\nYour as cold as ice. Willing to sacrifice.......nothing. Take your coffee before I do.")


class Blended(ICoffee):

    def __init__(self):
        self.drink = "Special Blend"

    def coffee_method(self):
        print("\nTo blend or not to blend. Order up")


# Responsible for creating instances
class CoffeeFactory:

    @staticmethod
    def order_coffee(coffee_type):
        if coffee_type == "Hot".casefold():
            return Hot()
        if coffee_type == "Iced".casefold():
            return Iced()
        if coffee_type == "Blended".casefold():
            return Blended()
        print("Invalid Type")
        return -1


if __name__ == "__main__":
    print("\n=======================================================================================")
    choice = input("What type of coffee do you want to order?\n")
    coffee = CoffeeFactory.order_coffee(choice)
    coffee.coffee_method()
    print("=======================================================================================")
