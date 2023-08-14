#include<stdio.h>
#define MAX_SIZE 100
int main()
{
    char a[MAX_SIZE];
    int i=0,spec,w,num;
    printf("enter the string:- \n");
    gets(a);
    while (a[i]!='\0')
    {
        if((a[i]>='a'&& a[i]<='z')|| (a[i]>='A'&& a[i]<='Z'))
        {
            w++;
        }
    else if (a[i]>=0 && a[i]<=9)
    {
       num;
    
    }
    else
    {
        spec++;
    }
    }
    printf("The number of words are:- \n",w);
    printf("The number of numbers are:- \n",num);
    printf("The number of specia characters are:- \n",spec);
}