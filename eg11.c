#include<stdio.h>
int main()
{
int x,y;
printf("Enter the runs scored in 2 matches: \n");
scanf("%d %d",&x,&y);
if(x>y)
{
    printf("Max runs score in match 1\n");
}
else
{
    printf("Max runs scored in match 2\n");
}
    
    return 0;
}