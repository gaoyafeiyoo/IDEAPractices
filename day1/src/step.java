

import java.util.Scanner;

public class step {
    static int sum = 0;
    public static void f(int n){
        if(n<=1){
            return ;
        }
        sum++;
        if(n%2==0){
            f(n/2);	// 如果是偶数，则除以2
        }else{
            f(n*3+1);	// 如果是奇数，则乘以3再加1
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("输入给定一个整数n（1<n<30）");
        int n = scan.nextInt();
        int i=0;
        while(true){
            f(++i);	// 得到角谷步数sum
            if(sum==n){
                System.out.println(n+"的角谷步数是"+i);
                return ;
            }
            sum = 0;
        }
    }
}






