import java.lang.*;
import java.util.*;
/*
enter the number:
5
eneter the data:
12
10
11
10
23
enter the data is:
12
10
11
10
23
summation of difference between even and odd no are: -2
*/
class A8
{
    
    public static void main(String arg[])
    {
      
    int isum=0;
    int isum1=0;
    int idiff=0;
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

            if(Arr[i]%2==0)
            {
                isum=isum+Arr[i];
            }
            if(Arr[i]%2==1)
            {
                isum1=isum1+Arr[i];
                idiff=isum-isum1;
            }
       
        }
        System.out.println("summation of difference between even and odd no are: "+idiff);
    }
}