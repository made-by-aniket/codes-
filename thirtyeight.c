#include<stdio.h>
int main()
{
   int a=1,n,i,mut;
   printf("Enter the value of n:- \n");
   scanf("%d",&n);
   printf("Enter the value of i:- \n");
   scanf("%d",&i);
   while (a<=n)
   {
    mut=i*a;
    
    printf("The %d multiples are:- %d \n",a,mut);
    a++;
   }

}