#include<stdio.h>
int main()
{
    int i,a,sum;
    printf("Enter the number:- \n");
    scanf("%d",&a);

    for(i=1;i<=a;i++)
    {
        for(sum=1;sum<=i;sum++)
        {
            
            printf("%d",sum);
            
        }
        printf("\n");
    }    

    return 0;
}