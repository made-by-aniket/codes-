#include <stdio.h>

int main()
{
  int n1,n2,n3,n4,n5;
  
  printf("Entre values of 5 number\n");
  scanf("%d %d %d %d %d",&n1,&n2,&n3,&n4,&n5);
  
  if(n1>n2 && n1>n3 && n1>n4)
  {
    if(n1>n5)
    {
        {
      printf("n1 is the greatest\n");
        }
      
    }
    else if(n2>n1 && n2>n3 && n2>n4)
       {
           if(n2>n5)
           {
           printf("n2 is the greatest\n");
           }
       }
       
         else if(n3>n1 && n3>n2 && n3>n4)
       {
           if(n3>n5)
           {
           printf("n3 is the greatest\n");
           }
       }
      else if(n4>n1 && n4>n2 && n4>n3)
       {
           if(n2>n5)
           {
           printf("n4 is the greatest\n");
           }
       }
         else if(n5>n1 && n5>n2 && n5>n3)
       {
           if(n5>n4)
           {
           printf("n5 is the greatest\n");
           }
       }
    return 0;
    
  }
  
  
  
}