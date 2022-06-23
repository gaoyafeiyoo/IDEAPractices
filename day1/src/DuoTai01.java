/*
* java中允许向上转型  子--->父，也允许向下转型 父--->子
* 无论是向上转型还是向下转型，两种类型之间必须要有继承关系，没有继承关系，编译器报错
*编译阶段：绑定父类的方法
* 运行阶段：动态绑定子类的方法
* 什么时候必须使用向下转型：如果你想调用的方法是子类对象特有的方法时，就必须使用向下转型
* 怎么避免ClassCastException异常的发生
* 使用instanceof运算符
* instanceof 可以在运行阶段动态判断引用指向对象的类型
* 语法：(引用  instanceof  类型)  其结果只能是true或者false
* 假设(c  instanceof Cat)为true表示c引用指向的堆内存中的对象是一个Cat对象
*  假设(c  instanceof Cat)为false表示c引用指向的堆内存中的对象是一个Cat对象
*
*
* 多态在开发中的作用：
*对扩展开放  对修改关闭
* 减低程序耦合度  提高程序扩展力
*
*
*
*
*
* */
public class DuoTai01 {
    public static void main(String[] args) {
Master xiaohei = new Master();
Dog keji = new Dog();
xiaohei.feed(keji);
    }
}

class Master{
    public void feed(Pet pet ){
        pet.eat();
    }
}

class Pet{
    public void eat(){
        System.out.println("宠物吃东西！");
    }
}
class Dog extends Pet{
    public void eat(){
        System.out.println("狗喜欢啃骨头！");
    }
}

class Cat extends Pet{
    public void eat(){
        System.out.println("猫猫喜欢吃鱼！");
    }

}