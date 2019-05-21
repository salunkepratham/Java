//number conversion to string
import java.util.Scanner;
public class num_to_str{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=obj.nextInt();
        int temp;
        String newstr="",str;
        while(num!=0){
            temp=num%10;
            num=num/10;
            str=getstr(temp);
            newstr=str+" "+newstr;
            
        }
        System.out.println("Conversion is : "+newstr);
    }
    public static String getstr(int num){
        switch(num){
            case 1:return "one";
            case 2:return "two";
            case 3:return "three";
            case 4:return "four";
            case 5:return "five";
            case 6:return "six";
            case 7:return "seven";
            case 8:return "eight";
            case 9:return "nine";
        }
        return "zero";
        }
}