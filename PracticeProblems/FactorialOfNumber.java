import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=1;
		for(int i=2;i<n+1;i++){
		    res *=i;
		}
		System.out.println(res);
	}
}
