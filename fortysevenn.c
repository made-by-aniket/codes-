#include<stdio.h>
int digits(int n)
{
    int ctr=0;
    
    if(n!=0)
    {
        ctr++;
        digits(n/10);
    }
    return ctr;
}
int main()
{
    int n,ctr;
    printf("Enter the number:-\n");
    scanf("%d",&n);
    ctr=digits(n);
    printf("The no.of digits is:- %d\n",ctr);

    return 0;
}