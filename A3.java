import java.lang.*;
import java.util.*;
/*
enter the element
4
enter the data:
10
21
31
12
enter the data are:
10
21
31
12
the sumation of data are:74
*/
class A3
{
    public static void main(String args[])
    {
        int isum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the element");
        int ivalue=sc.nextInt();

        int Arr[]=new int[ivalue];

        System.out.println("enter the data: ");
        for(int i=0;i<Arr.length;i++)
        {
          Arr[i]=sc.nextInt();
        }

        System.out.println("enter the data are: ");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
            isum=isum+Arr[i];
        }
        System.out.println("the sumation of data are:"+isum);

    }
}