import java.util.Scanner;
public class Rev{
public static void main(String[] args){
int a,n,rev,r;
Scanner sc =new Scanner(System.in);
n=sc.nextInt();
rev=0;
while(n>0){
r=n%10;
rev= (rev*10)+r;
n= n/10;
}
System.out.println(rev);
}}
