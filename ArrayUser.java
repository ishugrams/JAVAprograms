import java.util.Scanner;


class ArrayUser
{
    public static void main(String arg[])
    {
      int iCnt = 0;
      Scanner sobj = new Scanner(System.in);

      System.out.println("enter the size of array");
      int iSize = sobj.nextInt();

      //int Arr[] = (int *)malloc(iSizeof(int));
      int Arr[] = new int[iSize];

      
      System.out.println("Number of elements in the array are:"+Arr.length);
     
      System.out.println("Enter the elements of array:");

      for(iCnt = 0; iCnt < Arr.length; iCnt++)
      {
         Arr[iCnt] = sobj.nextInt();
      }

      System.out.println("Element of the array are:");

      for(iCnt = 0; iCnt < Arr.length; iCnt++)
      {
        System.out.println(Arr[iCnt]);
      }
      int iSum = 0;
      for(iCnt = 0; iCnt < Arr.length; iCnt++)
      {
        iSum = iSum +  Arr[iCnt];
      }

      System.out.println("Addition is:"+iSum);

    }
}