import java.lang.*;
import java.util.*;
/*
Enter the element:
5
enter the data:
12
13
14
15
16
the enter data is:
12
13
14
15
16
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
            System.out.println(Arr[icnt]);
            
        }
     
    }
}