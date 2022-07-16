import java.lang.*;
import java.util.*;

class A5
{
    public static void main(String arg[])
    {
        int imin=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number:");
        int ivalue=sc.nextInt();

        int Arr[]=new int[ivalue];

        System.out.println("eneter the data:");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sc.nextInt();
        }
        
        System.out.println("enter the data is: ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);

            if(imin>Arr[i])
            {
                imin=Arr[i];
            }
        }
        System.out.println("the minimum element is :"+imin);
    }
}