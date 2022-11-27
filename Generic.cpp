#include<iostream>
using namespace std;
template <class T>
T Add(T i, T j)
{
    T ans;
    ans = i + j;
    return ans;
}
int main()
{
   int a = 10, b = 11, iret = 0;
   float x = 90.0, y = 67.0f, fret = 0.0f;
   double p = 12.00000, q = 10.000, dret = 0.000d;
   iret = Add(a,b);
   fret = Add(x,y);
   dret = Add(p,q);
   cout<<"Addition of integer :"<<iret<<"\n";
   cout<<"Addition of float :"<<fret<<"\n";
   cout<<"Addition  of double :"<<dret<<"\n";
    return 0;
}