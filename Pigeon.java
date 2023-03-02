
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    public Pigeon(){
        this(0, 0, 0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        Pigeon.numberOfPigeon++;
    }
    
    public void eat(String food){
        if (food == "worm"){
            this.setWeight(this.getWeight()+0.5);
        }else if (food == "seed"){
            this.setWeight(this.getWeight()+0.2);
        }else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    public String toString(){
        return "Pigeon "+this.getWeight()+" kg and "+this.getHeight()+" cm. There are "+Pigeon.numberOfPigeon+" pigeons.";
    }
    
    public void fly(){
        this.setWeight(this.getWeight()-0.25);
        if (this.getWeight()>=5){
            System.out.println("Fly Fly");
        }else{
            System.out.println("I'm hungry.");
        }
    }
    public void takeOff(){
        this.setWeight(this.getWeight()-0.5);
        if (this.getWeight()>=5){
            System.out.println("Take Off");
        }else{
            System.out.println("I'm hungry.");
        }
    }
    public void landing(){
        this.setWeight(this.getWeight()-0.5);
        if (this.getWeight()>=5){
            System.out.println("Landing");
        }else{
            System.out.println("I'm hungry.");
        }
    }
}
