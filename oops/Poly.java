import java.util.Scanner;
class Shape {
    public Double area(Double r){
        return 3.14*r*r;
    }
    public Double area(Double l,Double b){
        return l*b;
    }
}
class Poly{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Circle:");
        Double r=sc.nextDouble();
        System.out.print("Rectangle:");
        Double l=sc.nextDouble();
        Double b=sc.nextDouble();
        Shape shape=new Shape();
        System.out.println("area of Circle::"+shape.area(r));
        System.out.println("area of rectangle::"+shape.area(l, b));
    }
    
    


    
}