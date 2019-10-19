package week5;

public class Dog extends Pet {


    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void makeSound()
    {
        super.makeSound(); //dodaje dane z klasy głównej
        System.out.println("how how");
    }
}
