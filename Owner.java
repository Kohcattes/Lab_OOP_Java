
public class Owner {
    protected final String name;
    protected Animal animal; 
    
    public Owner(){
        this("", null);
    }
    public Owner(String name){
        this(name, null);
    }
    public Owner(Animal animal){
        this("", animal);
    }
    public Owner(String name, Animal animal){
        this.setAnimal(animal);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    
    public void feedFood(Food f){
        this.getAnimal().eat(f);
    }
    public String toString(){
        return "Owner : name = "+this.getName()+", Animal : name = "+this.getAnimal().getName()+", power = "+this.getAnimal().getPower()+", age = "+this.getAnimal().getAge();
    }
    public void protectOwnerFrom(Animal a){
        if (this.getAnimal() instanceof Dog){
            ((Dog)this.getAnimal()).kick(a);
        }
        else if(this.getAnimal() instanceof Pigeous){
            ((Pigeous)this.getAnimal()).wingAttack(a);
        }
    }
    
}
