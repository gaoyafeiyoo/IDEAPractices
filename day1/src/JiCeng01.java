public class JiCeng01 {
    public static void main(String[] args) {
CreditAccount c = new CreditAccount();
c.setCredit(20.0);
        System.out.println(c.getCredit());
    }
}
//父类
class Account{
    //属性
    private String actNo;
    private double balance;
//构造方法
    public Account(){
    }

    public Account(String actNo, double balance){
    this.actNo = actNo;
    this.balance = balance;
    }
    //set 和 get 方法
    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public String getActNo() {
        return actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
 //信用卡账户类  子类  子类能继承父类除了构造方法之外的所有方法
class CreditAccount extends Account {
    private String actNo;
    private double balance;
    private double credit;
    
    public CreditAccount(){

    }

     public void setCredit(double credit) {
         this.credit = credit;
     }

     public double getCredit() {
         return credit;
     }
 }