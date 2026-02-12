// Problem 1:Class and Object

import java.util.Scanner;
public class Car{
     Scanner sc=new Scanner(System.in);
        String Brand=sc.nextLine();
        String Model=sc.nextLine();
        int Year=sc.nextInt();

}
class CandO {
    public static void main(String[] args) {
       Car car=new Car();
       System.out.println("Brand:"+car.Brand);
       System.out.println("Model:"+car.Model);
       System.out.println("Year:"+car.Year);
    }
}



