import javax.print.DocFlavor;
import java.util.concurrent.Callable;

//带static的要用类名.变量名访问
//不带static的要用引用.变量名访问
//带static的在方法区存储 如果这个类型的所有对象的某个属性值都是一样的就申请为static
//变量，节省内存开销  一个对象一份的是实例变量  所有对象一份的是实例变量
/*实例的必须使用 “引用.”的方式来访问
静态的推荐使用“类名.”的方式来访问   但是也可以使用“引用.”的方式来访问  但是会让程序员产生困惑
 */
public class Static02 {
    public static void main(String[] args) {
        System.out.println(Chinese.country);
        Chinese c1 = new Chinese("123", "张三");
        Chinese c2 = new Chinese("234", "李四");
        //c2 = null;
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c2.id); //这里出现空指针异常
        System.out.println(c2.country);//country是静态变量   不会出现空指针异常·
    }


}


class Chinese {
    String id;
    String name;
    static String country = "中国";

    public Chinese() {

    }

    public Chinese(String s1, String s2) {
        id = s1;
        name = s2;

    }
}
