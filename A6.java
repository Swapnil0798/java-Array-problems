import java.lang.*;
import java.util.*;
/*
enter the calculated number:
12
enter the number:
4
eneter the data:
12
12
13
14
enter the data is:
12
12
13
14
the no are in data is :2
*/
class A6
{
    public static void main(String arg[])
    {
    
        int icnt=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the calculated number:");
        int ino=sc.nextInt();

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

            if(Arr[i]==ino)
            {
                icnt++;
            }
        }
        System.out.println("the no are in data is :"+icnt);
    }
}