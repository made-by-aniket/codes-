#include<stdio.h>
int main()
{
	char a;
	int as,sum=0,n,temp;
	printf("The character is: \n");
	scanf("%c",&a);
	as=a;
	while(as>0)
	{
		temp=as%10;
		sum=sum+temp;
		as=as/10;
}
		printf("%d\n",sum);
	
	

	
	if(sum%2==0)
	{
		printf("It is a humble number\n");
	}
	else
	{
		printf("It is not a humble number\n");
	}
	
	return 0;
	
}