import java.util.Scanner;

class a{
     String a="Pratham";
     int b=20;
    static float c=30;
    static String d="Salunke";
    void v1(){
        System.out.println("Hello java");
    }
     public static void main(String[] args)
     {
         a obj=new a();
        // System.out.println(a);   //cant access non static variable inside static method  
         System.out.println(obj.a);
         System.out.println(obj.b);
         System.out.println(c);
         System.out.println(d);
        // v1();                       //error same explaination
        obj.v1();
     }
 }
 