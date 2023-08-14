#include<stdio.h>
int main()
{
    int a,t,n,tab;
    printf("Enter the value of n:- \n");
    scanf("%d",&n);
    printf("Enter the value of t:- \n");
    scanf("%d",&t);
    printf("The table is:- \n");
    for (a=1;a<=n;a++)
    {
       tab= t*a;
       printf("%d \n",tab);
    }
}