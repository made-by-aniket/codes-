#include<stdio.h>
int main()
{
    int a[12]={2,3,4,6,7,9,1,0,4,7,8,3},i=0,mut=0;
    while (i<12)
    {
    
        
            
        
         if (a[i]==0||a[i]==2||a[i]==4||a[i]==6||a[i]==8||a[i]==10)
        {
            mut++;
        }

        i++;

        
    }
    printf("The even numbers in the array are:- %d",mut);
    


}