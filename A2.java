import java.lang.*;
import java.util.*;
/*
Enter the element:
12
enter the data:
1
2
3
4
5
6
7
8
9
11
12
10
the enter data is:
the even are in array are:2
the even are in array are:4
the even are in array are:6
the even are in array are:8
the even are in array are:12
the even are in array are:10
*/
class A1
{
    public static void main(String arg[])
    {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the element:");
        int i=sc.nextInt();   

        int Arr[]=new int[i];

        System.out.println("enter the data:");

        for(int icnt=0;icnt<Arr.length;icnt++)
        {
            Arr[icnt]=sc.nextInt();
           
        }
       System.out.println("the enter data is: ");

       for(int icnt=0;icnt<Arr.length;icnt++)
        {  
            if(Arr[icnt]%2==0)
            {
            System.out.println("the even are in array are:"+Arr[icnt]);
            }
        }
     
    }
}