#include<stdio.h>
int fibn(int n)
{
    if (n==0||n==1)
    {
        return n;
    }
    else
    {
        return fibn(n-1)+fibn(n-2);
    }
    
}
int main()
{
    int n;
    printf("Enter the value of n:- \n");
    scanf("%d",&n);
    printf("The position of %d in the series  is:- %d \n",n,fibn(n));
    

    return 0;
}