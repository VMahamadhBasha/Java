import java.util.Scanner;
public class Revarray {
    static int arr[]=new int[101];
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();

     }
     for (int i = n - 1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + " ");
        }}

}
}
