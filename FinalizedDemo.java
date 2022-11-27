class Demo
{
    int Size;  
    int Arr[];  

    public Demo(int No)
    {
        System.out.println("Inside the Constructor");
        Size = No;
        Arr = new int[Size];
    }
    protected void finalize()
    {
        System.out.println("Inside the finalized method");
        Arr = null;
    }
}
class FinalizedDemo
{
    public static void main(String a[]) 
    {
      Demo obj = new Demo(4);
      obj = null;
      System.gc();
    }
}