import java.util.*;
//8
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int num = sc.nextInt();
        while (num>0){
            if(num>=5){
                System.out.print("||||/");
                num -= 5;
            }
            else{
                System.out.print("|");
                num -= 1;
            }
        }
    }
}
