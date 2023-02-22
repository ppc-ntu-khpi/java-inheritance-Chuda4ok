package domain;

public abstract class Animal {

    protected String Name;
    protected int Age;
    protected float Weight;
    public boolean WantsToEat;

    public abstract void Eat();
    public abstract void HaveDrink();
    public abstract void Sleep();
    public abstract void GetRoar();
    public abstract void Move();

    public void ShowInfo(){
        System.out.println("The name of the animal: " + this.Name);
        System.out.println("Age of the animal: " + this.Age);
        System.out.println("The weight of the animal: " + this.Weight);
        System.out.println("Does the animal want to eat?: " + this.WantsToEat);
    }
    public String GetName(){
        return this.Name;
    }
    public int GetAge(){
        return this.Age;
    }
    public void SetAge(int age){
        if(age > 0) {
            this.Age = age;
        }
        else System.out.println("Error! Age cannot be less than 0");
    }
    public float GetWeight(){
        return this.Weight;
    }
    public void SetWeight(float weight){
        if(weight > 0.1f){
            this.Weight = weight;
        }
        else System.out.println("Error! The weight cannot be less than 0.1");
    }
}
