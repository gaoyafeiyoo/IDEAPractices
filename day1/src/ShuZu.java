import java.util.Random;

public class ShuZu {
    public static void main(String[] args) {
        int [] arr = new int[6];
        Random r = new Random();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            int num = r.nextInt(100) + 1;
            arr[i] = num;
            sum = sum + arr[i];
            System.out.println("第" + (i + 1) + "个元素：" + arr[i]);
        }
        System.out.println(sum);
    }
}
