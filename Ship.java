
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        this(0);
    }
    public Ship(double fuel){
        this.setFuel(fuel);
    }
    
    public void move(){
        move(1);
    }
    public void move(int distance){
        while (distance>0){
            if(this.getFuel()<50){
                System.out.println("Fuel is not enough.");
                break;
            }
            this.fl0at();
            distance--;
        }
    }
    
    public void fl0at(){
        if (this.getFuel()>=50){
            this.setFuel(this.getFuel()-50);
            System.out.println("Ship moves");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        if (this.getFuel()>=10){
            this.setFuel(this.getFuel()-10);
            System.out.println("Engine starts");
        }else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    public void honk(){
        System.out.println("Shhhhh");
    }
    
}
