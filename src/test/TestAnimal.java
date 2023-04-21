package test;

import domain.Dog;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        Dog dog = new Dog("Сomein", 3, 22f, false);
        dog.ShowInfo();
        dog.Eat();
        dog.Play();
        dog.HaveDrink();
        dog.Move();
        dog.Sleep();
        dog.GetRoar();
    }
}
