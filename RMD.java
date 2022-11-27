class Base
{
  public void fun()
  {

  }
  public void gun()
  {

  }
  public void sun()
  {

  }
}
class Derived extends Base
{
    public void fun()
    {

    }
    public void gun()
    {

    }
    public void run()
    {
        System.out.println("Derived run");
    }

}





class RMD
{
    public static  void main(String a[])
    {
        Base bobj = new Derived();  //Upcasting
        bobj.fun();
        bobj.gun();
        bobj.sun();
    }


    /*
       Base obj = new Base()
    
    
    
    
    
     */
 
}
