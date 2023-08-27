#include<stdio.h>
int main()
{

int marks[3][4]={{2,3,4,5},
                 {2,5,6,8},
                 {3,5,7,9}};

for(int i=0;i<3;i++)
{
    for(int j=0;j<4;j++)
    {
        printf("The %d,%d element of the matrix is:- %d\n ",i,j,marks[i][j]);
    }
    
}


    
    return 0;
}