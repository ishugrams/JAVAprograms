import java.util.*;
//import java.ultil.Scanner;


class Input
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0;
        int iAns = 0;

         System.out.println("enter firt number:");
         iNo1 = sobj.nextInt();

         System.out.println("enter second number:");
         iNo2 = sobj.nextInt();

         iAns = iNo1 + iNo2;

         System.out.println("Adddition is:"+iAns);
    }
}



/*
Methods of scannner class

boolean     nextBool()
byte        nextByte()
char        nextLine()
int         nextInt()
float       nextFloat()
double      nextDoulbe()
short       nextShort()
long        nextLong()
 */