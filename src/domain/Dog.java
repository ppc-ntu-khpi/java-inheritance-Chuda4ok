package domain;

public class Dog extends Animal {

    public Dog(){
        this.Name = "Kerya";
        this.Age = 3;
        this.Weight = 48,5f;
        this.WantsToEat = false;
    }
    public Dog(String name, int age, float weight, boolean wantsToEat){
        this.Name = name;
        this.SetAge(age);
        this.SetWeight(weight);
        this.WantsToEat = wantsToEat;
    }
    public void Play(){
        System.out.println("The dog is playing with a ball");
    }
    @Override
    public void Eat() {
        if(WantsToEat)
            System.out.println("The dog eats meat");
        else
            System.out.println("The dog does not want to eat!");
    }
    @Override
    public void HaveDrink() {
        System.out.println("The dog drinks water");
    }
    @Override
    public void Sleep() {
        System.out.println("The dog sleeps at night");
    }
    @Override
    public void GetRoar() {
        System.out.println("Woof");
    }
    @Override
    public void Move() {
        System.out.println("The dog is moving");
    }
}
