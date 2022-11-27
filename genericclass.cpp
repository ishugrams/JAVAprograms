#include<iostream>

using namespace std;
  
  
class Array
{
    public:
    T *Arr;
    int Size;

    Array(int length)
    {
        Size = length;
        Arr = new T[Size];
    }
    void Accept()
    {
        cout<<"Enter the values\n";
        for(int i = 0; i <Size; i++)
        {
            cin>>Arr[i];
        }
    }


    void Display()
    {
        cout<<"values of arrray\n";
        for(int i = 0; i < Size; i++)
        {
            cout<<Arr[i]<<"\n";
        }
    }

};
int main()
{
    Array <int>obj1(5);

    obj1.Accept();
   Array obj1(5);
   obj1.Accept();
   obj1.Display();
    return 0;
}