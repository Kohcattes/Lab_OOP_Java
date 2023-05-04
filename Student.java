
import java.io.Serializable;


public class Student implements Serializable{
    public  String name;
    public int id;
    public int money;
    
    public Student(){
        this("", 0, 0);
    }
    public Student(String name, int ID, int money){
        this.name = name;
        this.id = ID;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}
