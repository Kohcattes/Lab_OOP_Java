
public class Seller extends Employee{
    public Food sell(Employee e){
        Food f = new Food();
        if (f.getPrice() <= e.getWallet().getBalance()){
            this.getWallet().setBalance(this.getWallet().getBalance()+f.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance()-f.getPrice());
            return f;
        }else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
