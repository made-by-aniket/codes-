#include<stdio.h>
int s(int* x,int* y)
{
    
    int so;
    *x=*x+*y;
    *y=*x-*y;
    *x=*x-*y;
    so=(*x+*y);

}
int main()
{
int a=4,b=6,sum;
printf("%d and %d\n",a,b);
sum=a+b;
printf("sum of %d and %d is: %d\n",a,b,sum);
s(&a,&b);
printf("%d and %d \n",a,b);

    
    return 0;
}