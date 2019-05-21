//inheritace==extend the property of base class

public class inheritance{
    public static void main(String[] args){
        cap c=new cap();           //crating instace of class cap of type cap
        c.m1(1,1.3f);                 //calling m1 of parent
        c.m1(5.6f, 6);
        System.out.println(c.id);
        top d=new top();           //crating instace of class top of type top
        d.m2(3.5f,4);                    //caling m2 of child         
        d.m1(4,6.7f);                    //calling m1 of parent class using child method
        System.out.println(d.roll);
        System.out.println(d.id);
    }
}
class cap{
    int id=1;
  final void m1(int a,float b){
        System.out.println("Class cap");
    }
    final void m1(float a,int b){
        System.out.println("Class cap");
    }
}
class top extends cap{
    int roll=2;
 final void m2(int a,float b){
      System.out.println("Class top");
  }
  final void m2(float a,int b){
      System.out.println("Class m2");
  }
}