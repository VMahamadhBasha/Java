import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c= sc.nextDouble();
        double r=Math.toRadians(c);
        double s=0.5 *a*b*Math.sin(r);
        double cl=Math.sqrt(a*a+b*b-2*a*b*Math.cos(r));
        double l=cl+a+b;
        double h= b*Math.sin(r);
        System.out.printf("%.6f",s);
        System.out.println();
        System.out.printf("%.6f",l);
        System.out.println();
        System.out.printf("%.6f",h);

    }
}
