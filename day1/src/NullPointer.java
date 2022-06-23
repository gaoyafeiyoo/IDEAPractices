/*空指针异常
* 空引用访问“实例相关的数据”会出现空指针异常。
* 实例相关的数据包括：实例变量 + 实例方法
* */
public class NullPointer {
    public static void main(String[] args) {
        User1 s1 = new User1();
        System.out.println(s1.id);
        s1.doSome();
       // s1 = null; //出现空指针异常
        //System.out.println(s1.id);
    }
}
class User1{
    int id;
    //实例方法（对象级别的方法 应该是一个对象级别的行为）  带static的可以不用对象参与就能够调用
    public void doSome(){
        System.out.println("doSome!");
    }


}