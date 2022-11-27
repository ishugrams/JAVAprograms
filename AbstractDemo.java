//abstract class is the class which contains  0 or more abstrat class in it
class AbstractDemo
{
    public static void main(String arr[])
    {
      Marvellous mobj = new Marvellous();
      int Ret = 0;
      Ret = mobj.Addition(11,10);
      System.out.println("Addition is :"+Ret);
      Ret = mobj.Substraction(11,10);
      System.out.println("sub is :"+Ret);
    }
}
class Marvellous extends Arithmatic
{
    public  int Substraction(int No1, int No2)
    {
        return No1 - No2;
    }

}

abstract  class Arithmatic
{
    public int Addition(int No1, int No2)
    {
        return No1 + No2;
    }
    public abstract int Substraction(int No1, int No2);
}


