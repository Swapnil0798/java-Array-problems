import java.lang.*;
import java.util.*;
/*
Enter the element:
5
Enter the data :
10
20
30
40
50
enter data is:
10
20
30
40
50
The maximum element in the data are: 50
*/
class A4
{
    public static void main(String arg[])
    {
        int imax=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the element: ");
        int ivalue=sc.nextInt();

        int Arr[]=new int[ivalue];

        System.out.println("Enter the data :");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sc.nextInt();
        }
        System.out.println("enter data is:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(+Arr[i]);
            if(imax<Arr[i])
            {
            imax=Arr[i];
            }
        }
  System.out.println("The maximum element in the data are: "+imax);

    }
}