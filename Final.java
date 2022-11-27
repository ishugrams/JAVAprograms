//Same as the constant charectaristics in C++


class Final 
{
    public static void main(String arr[])
    {
        Demo obj = new Demo();
        obj.No1++;
        //obj.No2++;
        //obj.No3++;
    }
}

class Demo
{
    public int i = 51;
    public int No1;
    public final int No2 = 11;
    public final int No3;

    public Demo()  //:No2(11), No3(21)
    {
        No1 = 0;
        No3 = 21;    //NA in C++
    }
}





