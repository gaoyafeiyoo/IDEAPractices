
public class MinZhiShu {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        java.util.Scanner s = new java.util.Scanner (System.in);
        int zhengShu = s.nextInt();
        printfMinZhiShu(zhengShu);
    }

//输出结果的函数
    public static void printfMinZhiShu(int n){
        int m = n;
        //升级版
        while(!isZhiShu(++n)){
        }
        System.out.println("比 " + m +" 大的最近的一个质数是:  " + n);

//繁琐版
       /* while(true) {
            n++;
            if(isZhiShu(n)) {
                System.out.println("比 " + m +" 大的最近的一个质数是:  " + n);
                break;
            }
        }*/


    }

//判断是否为质数的函数
    public static boolean isZhiShu(int sum){
        if(sum == 1)
            return false;
        for(int i = 2; i < sum; i++){
            if(sum % i == 0 )
                return false;
        }
        return true;
    }


}
