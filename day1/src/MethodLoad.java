/*方法重载:方法实现的功能相似时可以使用方法重载
条件
在同一个类中
方法名相同
参数列表不同（参数的个数，类型，顺序不同就算不同）
方法重载与方法名前面的返回值类型没关系，如果方法名相同，返回值类型不同
不叫做方法重载，叫方法重复
* */
public class MethodLoad {
    //主方法
    public static void main(String[] args) {
       sum(2,3);
       sum(2.13,3.12);
       System.out.println(100L);
    }

    //定义一个计算long类型求和的方法
    public static void sum(long a, long b){
        System.out.println( a + b);
    }
    //定义一个计算int类型求和的方法
    public static void sum(int a, int b){
        System.out.println( a + b);
    }
    //定义一个计算double类型求和的方法
    public static void sum(double a, double b){

        System.out.println(a + b);
    }

}
