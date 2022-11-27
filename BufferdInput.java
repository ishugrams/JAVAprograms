import java.io.*;
class BufferdInput
{
    public static void main(String A[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferdReader bobj = new BufferdReader(iobj);
        String name = null;
        int Age = 0;
        float marks = 0.0f;

        System.out.println("Enter your name");
        name = bobj.readline();

        System.out.println("Enter your age");
        Age = Integer.parseInt(bobj.readline());

        System.out.println("Enter your marks");
        marks = Float.parseFloat(bobj.readline());


        System.out.println("Name :"+name);
        System.out.println("")
    }
}