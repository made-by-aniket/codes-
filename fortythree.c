#include<stdio.h>
int main()
{
    int t,n,tab,i=1;
    printf("Enter the name of t:- \n");
    scanf("%d",&t);
    printf("Enter the value of n:- \n");
    scanf("%d",&n);
   
   do 
   {
       tab=t*i;
       printf("%d*%d=%d\n",t,i,tab);
       i++;
   }
   while(i<=n);
    

    

    return 0;
}