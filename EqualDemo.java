class Demo
{
    public int No1;
    public int No2;
     
    public Demo(int a, int b)
    {
        No1 = a;
        No2 = b;
    }
}
class EqualDemo
{
    public static void main(String a[])
    {
       // Demo obj = new Demo(11,21);
        //Demo obj = new Demo(11,21);
    String s1 = "Hello";
    String s2 = "Hello";
    System.out.println("Hashcode of the s1:"+s1.hashCode());  //1001
    System.out.println("Hashcode of the s2 :"+s2.hashCode());  //1001
      if(s1.equals(s2))   //if("Hello" == "Hello")
      {
           System.out.println("Object are same");
      }
      else
      {
        System.out.println("Objects are diffrent");
      }
      if(s1 == s2)   //if(1001 == 1001)
      {
           System.out.println("Object are same");
      }
      else
      {
                System.out.println("Objects are diffrent");
      }
    }
}