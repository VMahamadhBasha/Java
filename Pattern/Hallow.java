import java.util.Scanner;
public class Hallow {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /*
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i>1 && i<m  && j>1 && j<n ){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");

                }
             

            }
            System.out.println();
        }*/
       for(int i=1;i<=5;i++){
        System.out.println("*"*i);
       }
       for(int i=4;i>=1;i--){
        System.out.println("*"*i);
       }
    }
}
