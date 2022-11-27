import java.util.Scanner;
class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int No)
    {
        this.iSize = No;
        this.Arr = new int[iSize];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int iCnt = 0; iCnt < iSize;  iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    public void Display()
    {
       System.out.println("show the elements of array :");
       for(int iCnt =0; iCnt < iSize; iCnt++)
       {
        System.out.println(Arr[iCnt]);
       }
    }
    public int Addition()
    {
        int isum = 0;
        for(int iCnt = 0; iCnt < iSize; iCnt++)
        {
            isum = isum + Arr[iCnt];
        }
        return isum;
    }

    }


class ArrayOop
{
    public static void main(String arg[])
    {
       ArrayX obj1 = new ArrayX(4);
       obj1.Accept();
       obj1.Display();

       int iRet = obj1.Addition();
       System.out.println("addition is :"+iRet);
    }

}