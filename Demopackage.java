import java.util.*;

import Marvellous.Arithmatic;
import Marvellous.PPA.Loops;

class Demopackage
{
    public static void main(String arr[])
    {

    Scanner sobj = new Scanner(System.in);

   System.out.println("Enter the first number");  

     int iNo1 = sobj.nextInt();

    System.out.println("Enter second number");
     int iNo2 = sobj.nextInt();

     Arithmatic aobj = new  Arithmatic(iNo1,iNo2);
    int iResult = aobj.Addition();
    System.out.println("Addition is :"+iResult);

     iResult = aobj.Sub();
    System.out.println("Substration is :"+iResult);

    Loops lobj = new Loops();
    lobj.Display();
    }

}