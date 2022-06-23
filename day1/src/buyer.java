import java.sql.SQLOutput;

public class buyer {
    public static void main(String[] args) {
        java.util.Scanner m = new java.util.Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int num = m.nextInt();
        if (num > 2) {
            System.out.println("你可以穿走我的小棉袄");
        }
    }
}
