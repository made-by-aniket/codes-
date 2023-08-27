#include<stdio.h>
int main()
{
int r,h;
float pi=3.14,sa;
printf("Enter the value of r and h: \n");
scanf("%d %d",&r,&h);
sa=2*pi*r*(r+h);
printf("Surface area is: %.2f\n",sa);
    
    return 0;
}