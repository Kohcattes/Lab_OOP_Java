
public class Programmer extends Employee{
    private int happiness;
    
    public void coding(String str){
        if (this.getEnergy() >= 30){System.out.println("Your code is "+str);}
        else{System.out.println("Error Error Error");}
        this.setEnergy(this.getEnergy()-30);
        this.setHappiness(this.getHappiness()-30);
        
    }
    public void coding(char str){
        this.coding(str+"");
    }
    public int getHappiness(){
        return this.happiness;
    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }
}
