#include<stdio.h>
int main()
{
    int a;
    printf("Enter the value of a:- \n");
    scanf("%d",&a);
    if (a>50)
    {
        if (a%2==0)
        printf("a is greater than 50 and even");

        else
        printf("a is greater than 50 and odd");
    }
    else
    {
       if(a%2==0)
       printf("a is less than 50 and even");

       else
       printf("a is less than 50 and odd");
    }
}