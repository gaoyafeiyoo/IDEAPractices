/*面向对象的三大特征   封装  继承  多态
继承的前提是封装  多态的前提是继承
什么是封装  有什么用？
1.保证内部结构的安全性
2.屏蔽复杂，暴露简单

在代码级别上  封装有什么用
一个类体当中的数据，假设封装之后，对于代码的调用人员来说，不需要关心代码的复杂变化
只需要通过一个简单的入口就可以访问了

怎么进行封装：
第一步：属性私有化（使用private关键字进行修饰）
第二步：对外提供简单的操作入口set和get法  外部程序只能通过set方法修改 通过get方法获取
可以在set方法中设置关卡来保证数据的安全性
get和set方法都是实例方法  不能带static  实例方法的调用必须先new对象
 //带static的方法用"类名."的方式访问在   同一个类中  类名可以省略
//对象被称为实例 不带static的方法叫做实例方法  get和set都是实例方法，实例方法的调用必须先创建对象
    //然后通过引用.来实现
    //实例变量被称为对象变量   实例方法被称为对象方法
    // public + 返回值类型 +get属性（首字母大写）+（）{}
    //public + void + set属性（属性首字母大写  例如 setId）+ （一个形参列表）{}
    //只有方法列表中带有static才能用“类名.”的方式，set get方法不能用类名.的方法调用

* */
public class fengZhuang {
    public static void main(String[] args) {
        Person h = new Person();
        h.setId(20);
       //h.setId(180);
        System.out.print("年龄是：");
        System.out.println(h.getId());

    }
}
