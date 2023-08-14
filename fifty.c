#include<stdio.h>
int main()
{
	int y,ye=2023,age;
	unsigned int d=8,x,mm,mm2;
	printf("When were you born:- \n");
	scanf("%d/%d",&x,&y);
	
	age=ye-y;
	if(x<d)
    {
        mm=d-x;
        printf("The age of meghana is %d years old %d months old",age,mm);
    }
	else
    {
        mm2=x-d;
        printf("The age of meghana is %d years old %d months old",age,mm2);
    }

	return 0;
}