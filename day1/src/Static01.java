/*
* static被翻译为静态的
* 所有static修饰的都是类级别的
* 所有static修饰的都是用“类名.”的方式来访问的
* static修饰的变量是静态变量
* static修饰方法是静态方法
*
* 变量的分类
* 变量根据声明的位置进行划分：
* 在方法体中声明的变量叫做局部变量       在方法体外声明的变量叫做成员变量
* 成员变量又可以分为实例变量和静态变量
*
* */
class VarTest{
    //以下实例的都是对象级别的  访问时采用“引用.”的方式访问  需要先new对象  可能会出现空指针异常
    int i;//成员变量中的实例变量
    public void m2(){       //实例方法

    }
    //以下静态的都是类相关的  访问时采用“类名.”的方式访问，不要new对象  不会出现空指针异常的发生
    static int k; //成员变量中的静态变量
    public static void m1(){   //静态方法
    }

}


public class Static01 {
    public static void main(String[] args) {

    }
}
