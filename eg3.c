#include<stdio.h>
int main()
{
    int r,i,j;
    printf("Enter the number of rows:- \n");
    scanf("%d",&r);

    for(i=1;i<=r;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",i);
            
        }
        printf("\n");
    }

    return 0;
}