import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    
    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.acct = new ArrayList();
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    
    public Account getAccount(int index){
        return (Account)acct.get(index);
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    public int getNumOfAccount(){
        return this.acct.size();
    }
    
    public String toString(){
        return getFirstName()+" "+getLastName()+" have "+this.acct.size()+" account.";
    }
    public boolean equals(Customer c){
        return this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName());
    }
}
