import java.util.*;


class Collections2
{
    public static void main(String arg[])
    {
       LinkedList <String>lobj = new LinkedList<String>();

       lobj.add("Isha");
       lobj.add("kapil");
       lobj.add("laxmi");
       lobj.add("pooja");
       lobj.add("");

       System.out.println("Enter of linked list are :"+lobj);

       lobj.addFirst(1);

       System.out.println("enter of linked list aren :"+lobj);

       lobj.addLast(121);

       System.out.println("enter of linked list aren :"+lobj);

       Iterator iobj = lobj.iterator();
       System.out.println("Data using iterator is : ");
       while(iobj.hasNext())
       {
        System.out.println((iobj).next());
       }
  
       if(lobj.contains(121))
       {
        System.out.println("121 is present in LL");
       }
       else
       {
        System.out.println("121 is not presnt in LL");
       }

       lobj.remove();

       System.out.println("Enter of linked list are "+lobj);

       lobj.remove();

       System.out.println("Enter of linked list are "+lobj);

       lobj.remove(0);

       System.out.println("Enter of linked list are :"+lobj);

       lobj.removeFirst();

       System.out.println("Enter of linked list are :"+lobj);

       lobj.removeLast();

       System.out.println("Enter of linked list are :"+lobj);


       System.out.println("Number of elements :"+lobj.size());


       lobj.set(1,500);
       System.out.println("Elements of linked list are :"+lobj);


       lobj.clear();
       System.out.println("Elements of linked list are :"+lobj);


    }
}