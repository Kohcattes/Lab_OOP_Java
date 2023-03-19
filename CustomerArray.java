

public class Customer {
    private String firstName;
    private String lastName;
    private Account []acct;
    private int numOfAccount;
    
    public Customer(){
        this("", "");
    }
    public Customer(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.acct = new Account[5];
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
        return acct[index];
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        this.numOfAccount++;
    }
    public int getNumOfAccount(){
        return this.numOfAccount;
    }
    
    public String toString(){
        return getFirstName()+" "+getLastName()+" have "+this.numOfAccount+" account.";
    }
    public boolean equals(Customer c){
        return this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName());
    }
}
