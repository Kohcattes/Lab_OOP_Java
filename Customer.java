package lab09;
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    private int numOfAccount;
    
    public Customer(){
        this("", "", null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return acct;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString(){
        return firstName + " " + lastName + " " + getNumOfAccount();
    }
}