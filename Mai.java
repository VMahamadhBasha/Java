/*import java.util.Scanner;;
public class Apples {
    public static void main(String[] args)
    {
        int n,v;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        v=sc.nextInt();
        System.out.print(v%n);

    }
}*/
import java.util.Scanner;;
public class Main{
    public static void main(String[] args)
    {
        int n,v;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){

        v=sc.nextInt();
        if(v>20){
        System.out.print("HOT");
}
else{
 System.out.print("COLD");
}
n--;

    }
}
}
