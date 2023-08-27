#include<stdio.h>
#include<math.h>
int main()
{
int num,sq,cub;
printf("Enter the number: \n");
scanf("%d",&num);
if(num%2==0)
{
    sq=pow(num,2);
    printf("The number is even and its square is: %d",sq);
}
else
{
    cub=pow(num,3);
    printf("The number is odd and its cube is: %d",cub);
}


    
    return 0;
}