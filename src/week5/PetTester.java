package week5;

import java.sql.SQLOutput;

public class PetTester {
    public static void main(String[] args) {
        Cat tom = new Cat("tom", "British");
        tom.eat();
        tom.sleep();
        tom.makeSound();

        Dog hunter = new Dog("Hunter", "Buldog");
        hunter.eat();
        hunter.sleep();
        hunter.makeSound();

        System.out.println("==pETS SECTION==");
        Pet pet1 = new Cat("Tom", "British");
        Pet pet2 = new Dog ("Hunter", "Buldog");
        pet1.makeSound();;
        pet2.makeSound();

        Pet[] pets = new Pet[3];
        pets[0] = pet1;
        pets[1] = tom;
        pets[2] = hunter;

        for (Pet pet: pets)
        {
            pet.makeSound();
        }





    }
}
