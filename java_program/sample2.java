class b{
    int a=1;
    static int b=2;
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
    public static void main(String args[]){
       // v1();               //can't access non static method in static method
        b obj=new b();
       obj.v1();
       v2();
    }
}