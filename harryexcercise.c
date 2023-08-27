#include<stdio.h>
void add(int* x,int* y)
{
    *x=(*x+*y);
    *y=(*x-*y);
}
int main()
{
int a=5,b=2;
add(&a,&b);
printf("a and b now are:- %d %d\n",a,b);
    
    return 0;
}