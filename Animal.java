
public abstract class Animal {
    private String name;
    private int power;
    private int age;
    
    public Animal(){
        this("", 0, 0);
    }
    public Animal (String name,int power,int age){
        this.name = name;
        this.power = power;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean equals(Animal a){
        return (this.getAge() == a.getAge()) && this.getName().equals(a.getName());
    }
    public String toString(){
        return "Animal : name = "+this.getName()+", power = "+this.getPower()+", age = "+this.getAge();
    }
    public abstract void eat(Food f);
}
