class Demo{
    int x=20;
    static int b=25;
    void v2(){
        System.out.println("x1="+x);
        System.out.println("b1="+b);
    }
    static void v1(){
        Demo d=new Demo();
        System.out.println("hii");
        System.out.println("X="+d.x);
        System.out.println("b="+b);
    }
      public static void main(String[] args){
        Demo g = new Demo();
        System.out.println("x="+g.x);
        System.out.println("b="+b);
        v1();
        g.v2();
    }

}