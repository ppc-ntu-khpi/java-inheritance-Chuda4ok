package domain;


 /**
 * The class Dog extends animal
 */ 
public class Dog extends Animal {


/** 
 *
 * Dog
 *
 */
    public Dog(){ 

        this.Name = "Сomein";
        this.Age = 3;
        this.Weight = 22f;
        this.WantsToEat = false;
    }

/** 
 *
 * Dog
 *
 * @param name  the name. 
 * @param age  the age. 
 * @param weight  the weight. 
 * @param wantsToEat  the wants to eat. 
 */
    public Dog(String name, int age, float weight, boolean wantsToEat){ 

        this.Name = name;
        this.SetAge(age);
        this.SetWeight(weight);
        this.WantsToEat = wantsToEat;
    }

/** 
 *
 * Play
 *
 */
    public void Play(){ 

        System.out.println("The dog is playing with a ball");
    }
    @Override

/** 
 *
 * Eat
 *
 */
    public void Eat() { 

        if(WantsToEat)
            System.out.println("The dog eats meat");
        else
            System.out.println("The dog does not want to eat!");
    }
    @Override

/** 
 *
 * Have drink
 *
 */
    public void HaveDrink() { 

        System.out.println("The dog drinks water");
    }
    @Override

/** 
 *
 * Sleep
 *
 */
    public void Sleep() { 

        System.out.println("The dog sleeps at night");
    }
    @Override

/** 
 *
 * Get roar
 *
 */
    public void GetRoar() { 

        System.out.println("Woof");
    }
    @Override

/** 
 *
 * Move
 *
 */
    public void Move() { 

        System.out.println("The dog is moving");
    }
}
