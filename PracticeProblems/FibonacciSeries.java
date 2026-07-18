import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0;
        int n2=1;
        int t=0;
        System.err.print(n1+" "+n2+" ");
        for(int i=0;i<10;i++){
            t=n1+n2;
            n1=n2;
            n2=t;

            System.err.print(t+" ");
            
        }

	}
}
