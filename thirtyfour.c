#include<stdio.h>
int main()
{
    int a,n,c;
    printf("Enter the value of n:- \n");
    scanf("%d",&n);
    printf("Enter the  numbers:- \n");
    for (a=1;a<n;a++)
    {
        c=a*a*a;

        printf("numbers-%d and the cube of %d is:- %d \n",a,a,c);
        

    }
    
}
