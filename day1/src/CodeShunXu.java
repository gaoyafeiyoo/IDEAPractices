public class CodeShunXu {
    static {
        System.out.println("静态代码块1");     //1
    }
    public static void main(String[] args) {
        System.out.println("main begin!");    //3
        new CodeShunXu();
        System.out.println("main over");     //6
    }
    //无参构造方法
    public CodeShunXu(){
        System.out.println("无参构造方法");   //5
    }
    //实例代码块
    {
        System.out.println("实例代码块");   //4
    }
    //静态代码块
    static {
        System.out.println("静态代码块2");   //2
    }
}
