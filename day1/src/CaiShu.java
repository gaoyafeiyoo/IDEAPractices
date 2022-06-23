import java.util.Random;

public class CaiShu {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println("请输入一个1到100之间的整数");
        java.util.Scanner s = new java.util.Scanner (System.in);
        int zhengShu = s.nextInt();
        while(true) {
            if (zhengShu > num) {
                System.out.println("数偏大了，请重新输入！");
                zhengShu = s.nextInt();
            } else if (zhengShu < num) {
                System.out.println("数偏小了，请重新输入！");
                zhengShu = s.nextInt();
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
