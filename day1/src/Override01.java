public class Override01 {
    public static void main(String[] args) {
Bird b = new Bird();
b.move();
    }
}
//动物类
class Animal{
    public void move(){
        System.out.println("动物在移动！");
    }
}
//子类：鸟类
class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔!");
    }
}