package week5;

public class Pet {
    String name;
    String breed;


    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void sleep()
    {
        System.out.println("Im going to sleep now ");
    }

    public void eat()
    {
        System.out.println("Im going to eat now");
    }

    public void makeSound()
    {
        System.out.println("Agrrr");
    }
}
