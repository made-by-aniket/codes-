#include<stdio.h>
int num(int n)
{
    if(n<=50)
    {
        printf("%d\n",n);
       return num(n+1);

    }
    
}
int main()
{
    int n=1;
    printf("The natural numbers are:- ");
    num(n);


    return 0;
}