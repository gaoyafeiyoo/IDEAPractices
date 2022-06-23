public class Construct{
    public static void main(String[] args) {
        User m = new User();
        m.doSome();
        System.out.println(m.id);


    }
}
class  User{
   //实例变量
    int id;
    //实例方法
    public  void doSome(){
        System.out.println("do some");
    }
}
