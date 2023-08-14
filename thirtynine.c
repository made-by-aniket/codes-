#include<stdio.h>
int main()
{
    int a=1,n,i,tab;
    printf("Enter the vaue of n:- \n");
    scanf("%d",&n);
    printf("Enter the vaue of i:- \n");
    scanf("%d",&i);
    while(a<=n)
    {
        tab=i*a;
        printf(" %d * %d= %d \n",i,a,tab);
        a++;
    }
}