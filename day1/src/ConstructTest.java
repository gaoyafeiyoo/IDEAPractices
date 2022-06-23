import sun.security.mscapi.CPublicKey;

//实例变量都需要创建对象，通过引用.的方式来访问
public class ConstructTest {
    public ConstructTest() {

    }

    public static void main(String[] args) {
        ConstructTest.doSome();
        doSome();
        ConstructTest u = new ConstructTest();
        u.doOther();

    }

    public static void doSome() {
        System.out.println("do some");
    }

    public void doOther() {
        System.out.println("do other");
    }

}
