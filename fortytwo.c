#include<stdio.h>
#define MAX_SIZE 100
int main()
{
    char a[MAX_SIZE],i=0,count=0;
    printf("Enter the value of string:- \n");
    gets(a);
    while(a[i]<=MAX_SIZE)
    {
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
        {
            count++;
        }
        i++;
    }
    printf("The vowels in the word is:- %d\n",count);
}