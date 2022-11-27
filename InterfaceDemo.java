interface Circle
{
    float PI = 3.14f;
    float Area( float Radius);     //public abstact float Area(float Radius);
    float Circumferance(float Radius); //public abstact float circumaferance(float Radius)
}
class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI * Radius * Radius;
    }
    public float Circumferance(float Radius)
    {
        return 2 * PI * Radius;
    }
}
class InterfaceDemo
{
    public static void main(String arr[])
    {
       System.out.println("value of PI is :"+Circle.PI);
       //Circle.PI = 7.12f;
       Circle cobj = new Marvellous();
       float Ret = 0.0f;
       Ret = cobj.Area(10.5f);
       System.out.println("Area is :"+Ret);
       Ret = cobj.Circumferance(10.5f);
       System.out.println("circumferance is :"+Ret);
    }
}