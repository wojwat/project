package week5;

public class PetTester {
    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.name = "Tom";
        tom.breed = "British";
        tom.eat();
        tom.sleep();
        tom.makeSound();

        Dog hunter = new Dog();
        hunter.name = "Hunter";
        hunter.breed = "Buldog";
        hunter.eat();
        hunter.sleep();
        hunter.makeSound();

    }
}
