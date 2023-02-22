package test;

import domain.Dog;

public class TestAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog("Kerya", 3, 44.5f, false);
        dog.ShowInfo();
        dog.Eat();
        dog.Play();
        dog.HaveDrink();
        dog.Move();
        dog.Sleep();
        dog.GetRoar();
    }
}
