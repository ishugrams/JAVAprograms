class Multi
{
    public static void main(String arg[])
    {
        //arr is 2 dimensional array which contain 3 one diemensional
        //array eaxh one dimensional array contain 4 elements
        //each element is of type integer

        //allowed in c,c++
        //NA in java
        //int Arr[3][4] = {10,20,30,40},{50,60,70,80},{90,100,110,120};

    //Aloowd in java
        int Arr[][] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};

        System.out.println(Arr.length);  //3
        System.out.println(Arr[0].length);  //4
    }
}