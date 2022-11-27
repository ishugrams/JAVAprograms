class Demo   //class extend object
{
    public int iNo1;
    public int iNo2;

    public Demo()  //construct is sepcial function
    {
        System.out.println("Inside default constructor");
        iNo1 = 0;
        iNo2 = 0;
    }
    public Demo(int a, int b)
    {
        System.out.println("Inside paramitarized constructor");
    }
    public int Addition()
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public int Subtraction()  //beharviour
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }
}//end of maths class

class Maths
{
    public static void main(String arr[])
    {
       System.out.println("Inside main function");

       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo(10,11);
       dobj2 = new Demo(10,11);

       int iRet = 0;
       iRet = dobj1.Addition();
       System.out.println("adddition is :"+iRet);

       iRet = dobj2.Addition();
       System.out.println("addition is:"+iRet);
            
    }
}