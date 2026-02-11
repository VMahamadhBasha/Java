/*import java.util.Scanner;
public class P {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       int k=1;
       for(int i=1;i<=n;i++){
             for(int j=0;j<i;j++){
                System.out.print(k+" ");
                k++;
             }
             System.out.println();
       }
        

    }
}
  
        for (int i=0;i<n;i++){
            int c=sc.nextInt();
            if(c>=2000){
            System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }*/



/*1.Printing
import java.util.Scanner;
public class Mai{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
     */



/*2.
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n;i++){
            s +=a[i];
        }
        System.out.println(s);

    }
} */



/*3.Max
import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=0;
        for(int i=0;i<n;i++){
              if(a[i]>a[m]){
                m=i;
              }
        }
        System.out.println(m);
    }
} */



/*4.Finding
import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b=0;
        for(int i=0;i<n;i++){
              if(m==a[i]){
                b=1;
              }
        }
        if (b==1) System.out.println("YES");
        else System.out.println("NO");
    }
}  */

/*5.Product of array
import java.util.Scanner;
public class P{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int j=0;j<k;j++){
        n=sc.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=1;
        for(int i=0;i<n;i++){
            s *=a[i];
        }
        System.out.println(s);

    }
    }
}
Ksrmce@admin123
 */


/*6.Min of array
import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=0;
        for(int i=1;i<n;i++){
              if(a[i]<a[m]){
                m=i;
              }
        }
        System.out.println(m);
    }
} */

/*7.reverse of an array
import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=a.length -1 ;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
} */
/*8.sum of even and odd
import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int o=0,e=0;
        for(int i=0;i<n;i++){
            if (i%2==0) o+=a[i];
            else e+=a[i];
        }
        System.out.println(o+" "+e);
        
        
    }
} 
     */

/*9. 
import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int o=1,e=1;
        for(int i=0;i<n;i++){
            if (i%2==0) o*=a[i];
            else e*=a[i];
        }
        System.out.println(o+" "+e);
        
        
    }
}
    */

/*10.
import java.util.Scanner;

public class P {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int o=1,e=1;
        for(int i=0;i<n;i++){
            if (i%2==0) o*=a[i];
            else e*=a[i];
        }
        System.out.println(o+" "+e);
        
        
    }
} */




