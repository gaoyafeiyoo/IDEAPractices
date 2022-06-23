/*构造方法是用来创建对象和初始化实例变量的（给对象的属性赋值）
实例变量没有手动赋值时，系统会赋默认值

调用构造方法所以new运算符来调用

构造方法的语法结构是
[修饰符列表] 构造方法名 (形式参数列表){
构造方法体
}
作用：创建对象  给对象的属性初始化

普通方法的语法结构
[修饰符列表] 返回值类型 方法名 (形式参数列表){
方法体
}
1.构造方法没有返回值类型 也不用写void
2.修饰符列表目前统一写public 千万不要写public static
3.构造方法名必须和类名保持一致
4.构造方法不需要指定返回值类型  写上void就变成了普通方法了就不是构造方法了


当一个类没用提供任何构造方法，系统会提供一个默认的无参数的构造方法，而这个构造方法被称为缺省构造器
如果自己手动提供了任意一个有参构造，那么系统的无参构造就不再提供了  再调用无参构造创建对象系统就会报错
所以我们写程序尽量自己手动写一个无参构造以防系统出错
* */
public class Constructer01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("zhangsan",1111111,20);
        //此处的输出结果是 Student@1b6d3586
        System.out.println(s1);
        System.out.println(s2.name + "\t" + s2.id + "\t" + s2.age);
    }
}

class Student {

    String name;
    int id;
    int age;

    Student(){
        System.out.println("无参数构造方法执行！");
    }

    Student (String xingming, int xuehao, int nianling ){
        name = xingming;
        id = xuehao;
        age = nianling;
        System.out.println("有参数构造方法执行！");
    }
}
