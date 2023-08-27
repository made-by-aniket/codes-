#include<stdio.h>
int main()
{

int marks;
printf("Enter the marks:\n");
scanf("%d",&marks);
if(marks>=0)
{
    if(marks>=90&&marks<=100)
    {
        printf("A grade\n");
    }
    else if(marks>=70&&marks<=89)
    {
        printf("B grade\n");
    }
    else if(marks>=50&&marks<=69)
    {
        printf("C grade\n");
    }
    else if(marks>=30&&marks<=49)
    {
        printf("D grade\n");
    }
    else if(marks>=20&&marks<=29)
    {
        printf("E grade\n");
    }
    else if(marks>=0&&marks<=19)
    {
        printf("F grade\n");
    }
    else
    {
        if(marks<0)
        {
            printf("Invalid");
        }
    }
}
    
    return 0;
}