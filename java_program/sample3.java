class c{
    int a=121;
    static int b=22;
    void v1(){
        System.out.println("In class b,v1");
        System.out.println(a);
        System.out.println(b);
    }
    static void v2(){
        System.out.println("In class, v2");
        //System.out.println(a);     //can't access non static instace  variable in static method
        b obj=new b();
        System.out.println(obj.a);
        System.out.println(b);
    }
}
class d{
    public static void main(String... args){
       /* System.out.println(a);
        System.out.println(b);
        v1();                    //can't access other class static and non static method and variable without object
        v2();*/
        c obj1=new c();
        System.out.println(obj1.a);
        System.out.println(c.b);
        obj1.v1();
        c.v2();

    }
}