#include<stdio.h>
int main()
{
    int a,s=0;
    printf("The first 10 natural numbers are:- \n");
    for (a=1;a<=10;a=a+1)
    {
        s= s+a;
        printf("%d \n",a);
    }
    printf("The sum of first 10 natural numbers is:- %d",s);
}