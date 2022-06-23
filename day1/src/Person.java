public class Person {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int m) {
        if(m < 0 || m > 150) {
            System.out.println("对不起，您输入的年龄不合法，请重新输入！");
            return;
        }
        id = m;
    }
}
