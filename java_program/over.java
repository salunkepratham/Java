public class over{
    public static void main(String[] args){
        cap c=new cap();
        c.m1();
        top d=new top();
        d.m2();
        d.m1();

    }
}
class cap{
    void m1(){
        System.out.println("Class cap");
    }
    
}
class top extends cap{
  void m2(){
      System.out.println("Class top");
  }
}