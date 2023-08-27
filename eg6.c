#include<stdio.h>
int main()
{
float a;
int r;
printf("Enter the number: \n");
scanf("%f",&a);
r=(int)(a<0?(a-0.5):(a+0.5));
printf("The rounded number is: %d",r);
    
    return 0;
}