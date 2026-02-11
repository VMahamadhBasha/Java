import java.util.Scanner;

public class Fever {
    public static void main(String[] args){
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++){
            int v=sc.nextInt();
            if(v>98){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    } 
}
