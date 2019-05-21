/*method overriding==which have same method name as in parent and child class */

class overriding{
    public static void main(String my[]){
        Employee e=new Employee();
        e.show();
        Dept d=new Dept();
        d.show();
      /*  Dept d1=new Employee();                 //achieve run time polymorphism
        d1.show();          */
    }
}
class Dept{
    int id=9;
    String name="Account";
    void show(){                                //method overriding   //can't use final keyword in overriding
        System.out.println("id="+id);
        System.out.println("name="+name);
    }
}
class Employee extends Dept{
    int id=3;
    String name="Pratham";
    void show(){                                    //static method can be override but run-time polymorphism can't achieve
        System.out.println("id="+id);
        System.out.println("name="+name);
    }
}