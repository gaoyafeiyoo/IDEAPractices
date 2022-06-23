/*
实例语句块在类加载的时候不执行！
实例语句块在构造方法之前执行！每调用一次构造方法就执行一次实例语句块（new对象的时候执行）
* */
public class ShiLi {

    public static void main(String[] args) {
        System.out.println("main begin!");
        new ShiLi();
    }


    {
        System.out.println("实例语句块执行！");
    }

    public ShiLi(){
        System.out.println("无参构造执行！");
    }

    public ShiLi(String name){
        System.out.println("有参构造执行！");
    }
}
