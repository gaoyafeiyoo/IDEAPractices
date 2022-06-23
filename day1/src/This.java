/*
this除了可以用在实例方法中 还可以用在构造方法中 ，可以通过当前构造方法去调用本类的另外一个构造方法
语法格式：this(实际参数列表)    可以用无参构造调用有参构造
这个语法作用就是代码复用
死记硬背：对于this()的调用只能出现在构造方法第一行
* */
public class This {
    public static void main(String[] args) {
        Data d = new Data();
        Data c = new Data();
d.printf();
c.printf();
    }
}
class Data {
    private int year;
    private int month;
    private int day;
    public Data(){
        this(2000,9,14);
    }
    public Data(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void printf(){
        System.out.println(year + "年" + month + "月" + day + "日");}
}
