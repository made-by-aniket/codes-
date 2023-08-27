#include<stdio.h>
int main()
{
int a,b,c,sum;
printf("Enter the values of a,b,c: \n");
scanf("%d%d%d",&a,&b,&c);
sum=a+b+c;
if(sum==180)
{
    printf("Triangle is possible\n");
}
else
{
    printf("Triangle is not possible");
}

    
    return 0;
}