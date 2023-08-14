#include<stdio.h>
int fact(int number)
{
    if(number==1||number==0)
    {
        return 1;
    }
    else 
    {
        return number*fact(number-1);
    }
}
int main()
{
    int num;
    printf("Enter the number\n");
    scanf("%d",&num);
    printf("The factorial of %d is:- %d \n",num,fact(num));

    return 0;
}