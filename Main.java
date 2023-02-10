
public class Main {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.mScore = 80;
//        s.fScore = 80;
//        s.showGrade();
//        
//        Fraction f1 = new Fraction();
//        f1.topN = 1;
//        f1.btmN = 3;
//        Fraction f2 = new Fraction();
//        f2.topN = 4;
//        f2.btmN = 16;
//        Fraction f3 = new Fraction();
//        f3.topN = 5;
//        f3.btmN = 15;
//
//        System.out.println(f1.toFloat());
//        System.out.println(f2.toFloat());
//        System.out.println(f3.toFloat());
//        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
//        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
//        System.out.println("Before : " + f2.toFraction());
//        f2.LowestTermFrac();
//        System.out.println("After : " + f2.toFraction());
//
//        Cat c = new Cat();
//        c.defineCat("Mew","White");
//        c.speak();
//        c.upWeight(5);
//        c.upHeight(10);
//        c.speak();
//        c.upWeight(-5);
//        c.upHeight(-10);
//        c.speak();
        Customer c = new Customer();
        c.name = "Taravichet";

        MyDate dob = new MyDate();
        dob.day = 8;
        dob.month = 11;
        dob.year = 2023;

        Account acct = new Account();
        acct.name = c.name;
        acct.balance = 500;

        c.DOB = dob;
        c.acct = acct;

        System.out.println("My name is " + c.name + ".");

        c.acct.showInfo();
        c.DOB.showDate();

        c.acct.deposit(500);
        c.acct.showInfo();
        c.acct.withdraw(3000);
        c.acct.showInfo();
    }
}