import java.io.*;

class GenericMethod
{
    public static <T> void Display(T Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

    }


    public static void main(String a[])
    {
        Integer Arr[] = {10,20,30,40};

        Display(Arr);

       Character cArr[] = {'a', 'b', 'c', 'd'};
       Display(cArr);

       Float fArr[] = {1.0f, 20.0f, 30.0f, 40.00f};
       Display(fArr);
    }
}

class GenericClass
{
    public static void main(String a[])
    {
        
    }
}