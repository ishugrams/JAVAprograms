import java.util.*;

Exceptiondemo2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int Ar[] = {10,20,30,40};

        System.out.println("Enter thr index of arry");
        int i = sobj.nextInt();

        System.out.println("Data at specialed index is :"+Ar[i]);

    }
}