#include<stdio.h>
int main()
{
    int rows,i,j,u=1;
    printf("Enter the rows:- \n");
    scanf("%d",&rows);
    for(i=1;i<=rows;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",u++);
            
        }
        printf("\n");
    }

    return 0;
}