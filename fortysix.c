#include<stdio.h>
int sum(int s)

{
    
    if (s==1)
    {
        return 1;
    }
    else 
    {
        return s+sum(s-1);
    }
}
int main()
{
    int s;
    printf("Enter the last number of range:- \n");
    scanf("%d",&s);
    printf("The sum is:- %d\n",sum(s));

    return 0;
}