#include<stdio.h>
void reversearr(int* arr,int start,int end)
{
    while(start<end)
    {
    int rev=arr[start];
    arr[start]=arr[end];
    arr[end]=rev;
    start++;
    end--;
    }
        int size=7;

    for(int a=0;a<size;a++)
    {
        printf("%d element of Reversed array is: %d\n",a,arr[a]);
        
        
    }
}
int main()
{

int arr[]={1,2,3,4,5,6,67},i;
for( i=0;i<7;i++)
{
    printf("The %d element of array is: %d\n",i,arr[i]);
}
reversearr(arr,0,i-1);

    
    return 0;
}