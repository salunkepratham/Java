import java.util.Scanner;
class input{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter x value:");
        int x=obj.nextInt();
        System.out.println("Enter string:");
        String y=obj.next();
        System.out.println("Enter value:");
        int z=obj.nextInt();
        System.out.println("Enter name:");
        String a=obj.next();
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("a="+a);
        System.out.println("Enter double:");
        double b=obj.nextDouble();
        System.out.println("b="+b);
        System.out.println("Enter char: ");
    }
}