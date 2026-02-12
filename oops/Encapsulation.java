import java.util.Scanner;

class Banka {
    private Long ac_no;
    private Long balance;
    public Long getac_no() {
        return ac_no;
    }
    public void setac_no(Long ac_no) {
        this.ac_no = ac_no;
    }
    public Long getbalance() {
        return balance;
    }
    public void setbalance(Long balance) {
        this.balance = balance;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Acccount Number::");
        Long ac_no=sc.nextLong();
        Banka banka=new Banka();
        banka.setac_no(ac_no);
        System.out.println("Acccount Balance::");
        Long balence=sc.nextLong();
        banka.setbalance(balence);
        System.out.println("Account Number::"+banka.getac_no()+"\n"+"Balance::"+banka.getbalance());


    }
}
