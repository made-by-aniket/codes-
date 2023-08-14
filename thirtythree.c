#include<stdio.h>
int main()
{
    int a,n,s=0;
    printf("Enter the value of n:- \n");
    scanf("%d",&n);
    printf("The first n numbers are:- \n");
    for (a=1;a<n;a=a+1)
    {
        s=s+a;
        printf("%d \n",a);
    }
    printf("Sum of first n numberss are:-  %d  \n",s);
}