#include<stdio.h>
int main()
{
int num,count=0;
printf("Enter the number: \n");
scanf("%d",&num);
while(num>0)
{
    if(num%10==5)
    {
        count++;
    }
    else{
        count=0;
    }
    num/=10;
    
}
if(count==3)
{
    printf("YES\n");
}
else{
    printf("NO");
}
return 0;
}

    
    
