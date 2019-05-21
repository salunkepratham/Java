import java.util.Scanner;
class arrinput{
    public static void main(String []args){
        Scanner obj1=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
         arr[i]=obj1.nextInt();   
        }
        int max=0;
        int max1=0;
        System.out.println("Array element:");
        if(arr[0]>arr[1])
        {
            max=arr[0];
            max1=arr[1];
        }
        else{
            max=arr[1];
            max1=arr[0];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max1=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>max1){
                    max1=arr[i];
                }
            }
        System.out.println("max="+max);
        System.out.println("max1="+max1);
    }
}