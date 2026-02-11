import java.util.Scanner;

public class Launvhtime {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            int v=sc.nextInt();
            if(v>=1 && v<=4){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            n--;
        } 
        

    }
}
