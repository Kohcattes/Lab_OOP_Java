
public abstract class Bird extends Animal implements Flyable{
    public Bird(String name, int age){
        this.setName(name);
        this.setAge(age);
        this.setPower(150);
    }
    
    public abstract void wingAttack(Animal a);
}
