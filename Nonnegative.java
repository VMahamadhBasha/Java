import java.util.Scanner;
public class Nonnegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            int k=sc.nextInt();
            int arr[]=new int[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();

            }
            int c1=0;
            int c2=0;
            for(int i=0;i<k;i++){
                if(arr[i]==0) c1++;
                else if(arr[i]<0) c2++;

            }
            if(c1>0 || c2%2==0){
                System.out.println("0");
            
            }
            else{
                System.out.println("1");
            }

        }
        
        }
}

