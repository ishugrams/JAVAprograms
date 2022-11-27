import java.util.*;

class ExceptionDemoSol
{
    public static void main(String a[])
    {
    Scanner sobj = new Scanner(System.in);
    int iNo1 = 0; 
    int iNo2 = 0; 
    int iAns = 0;
    System.out.println("Enter the first number");
    iNo1 = sobj.nextInt();
    System.out.println("Enter the second number");
    iNo2 = sobj.nextInt();
    
    
        try
        {
        System.out.println("Inside the try block");
        iAns = iNo1 / iNo2;
        System.out.println("Division is :"+iAns);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("inside the catch block");
            System.out.println(obj);
        }
        catch(NullPointerException obj)
        {
            System.out.println("inside the catch 2");
            System.out.println(obj);
        }
        catch(Exception obj)
        {
            System.out.println("Inside the catch 3");
            System.out.println(obj);
        }
        finally
        {
            System.out.println("Inside finally block");
            sobj.close();
        }
    
    }
}