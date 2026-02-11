import java.util.Scanner;

public class Chef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
          
            int l=sc.nextInt();
            int r=sc.nextInt();
            int t=sc.nextInt();
            int p= (t+l-1)/l;
            int c=t/r;
            System.out.println(p+c);
           
          
        }

    }
}
