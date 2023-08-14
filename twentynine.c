#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter the value of a,b and c:- \n");
    scanf("%d%d%d",&a,&b,&c);

    if(a==b)
    {
        if (b==c)
        {
            printf("The triangle is equilateral");
        }
        else
        {
            printf("The triangle is isosceles");
        }
    }
    else
    {
        if (b==c||a==c)
        {
            printf("The triangle is isosceles");
        }
        else
        {
            printf("The triangle is scalene");
        }

    }
}