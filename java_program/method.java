import java.util.Scanner;
class constructor{
    public static void main(String[] args){
        stud s1=new stud();
        stud s2=new stud("Pratham",9768701074L);
        stud s3=new stud("Akshay",1);
        s3.show();
    }
}
class stud{
    String name;
    int id;
    long mob;
    stud(){                                         //non-parameterized constructor
        System.out.println("Hello");
        Scanner obj=new Scanner(System.in);
        name=obj.next();
        System.out.println("name="+name);
    }
    stud(String nam,Long m){                                         //parameterized constructor    /*constructor overloading */ 
        System.out.println("Hello "+nam);
        System.out.println("Mob : "+m);
    }
    stud(String nam,int n){                         //parametrized constructor
        name=nam;
        id=n;
    }
    void show(){
        System.out.println("In m1");
        System.out.println("name="+name);
        System.out.println("id="+id);
    }
}
