public class Override03 {
    public static void main(String[] args) {
ChinesePeople p1 = new ChinesePeople();
p1.setname("小黑");
p1.speak();
AmericaPeople p2 = new AmericaPeople();
p2.setname("小白");
p2.speak();  
    }
}
//人
class People{
   private String name;
   public People(){}
   public People(String name){
       this.name = name;
   }
   public void setname (String name){
       this.name = name;
   }
   public String getname (){
       return this.name;
   }
   public void speak(){
       System.out.println(name + ".......");
   }
}

//中国人
class ChinesePeople extends People{

    @Override
    public void speak() {
        System.out.println(this.getname() + "正在说汉语");
    }
}
//美国人
class AmericaPeople extends People{
    @Override
    public void speak() {
        System.out.println(this.getname() + "speak English");
    }
}
