#include<stdio.h>
int main()
{
float p,t,r,si,amo;
printf("Enter the values of p,t,r: \n");
scanf("%f%f%f",&p,&t,&r);
si=(p*t*r)/100;
printf("Si is: %.2f\n",si);
amo=p+si;
printf("Total amount is: %.2f\n",amo);
    
    return 0;
}