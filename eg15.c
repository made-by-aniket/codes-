#include<stdio.h>
int main()
{
float dist,fuel,MPG;
printf("Enter distance and fuel consumed: \n");
scanf("%f%f",&dist,&fuel);
MPG=dist/fuel;
printf("The value of MPG is: %.2f",MPG);
    
    return 0;
}