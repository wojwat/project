package week5;

public class Cat extends Pet{
    public Cat(String name, String breed) {
        super(name, breed);
    }

    @Override
    public void makeSound()
    {
        System.out.println("meu meu");
    }


}
