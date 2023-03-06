
public class Dog extends Animal{
    public Dog(String name, int age){
        this.setName(name);
        this.setAge(age);
        this.setPower(200);
    }
    
    public void eat(Food f){
        this.setPower(this.getPower()+f.getPower());
    }
    
    public void kick(Animal a){
        a.setPower(a.getPower()-10);
    }
}
