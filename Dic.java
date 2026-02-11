import java.util.Scanner;;
public class Dic{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            int f=sc.nextInt();
            int s=sc.nextInt();
            int fd=sc.nextInt();
            int sd=sc.nextInt();
            if((f-fd) > (s-sd)){
                System.out.println("Second");
            }
            else{
                if((f-fd) < (s-sd)){
                System.out.println("First");
                }
                else{
                    System.out.println("Any");
                }
            }
            n--;
        }
    }
        
    
}
