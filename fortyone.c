#include<stdio.h>
int main()
{
        int d,m,y;
        int p,q,r;
        printf("Enter the date of birth:- \n");
        scanf("%d/%d/%d",&d,&m,&y);
        printf("The date of birth is:- %d/%d/%d \n",d,m,y);

        printf("Enter the current date:- \n");
        scanf("%d/%d/%d",&p,&q,&r);
        printf("The current date is:- %d/%d/%d\n",p,q,r);

        if(y>=1023&&q<=2023)
        {
             if (m>=1&&m<=12)
             {
                if((d>=1&&d<=31)&&(m==01||m==03||m==05||m==07||m==8||m==10||m==12))
                {
                        printf("The date is fine\n");
                }
                else if((d>=1&&d<=30)&&(m==04||m==06||m==9||m==11))
                {
                        printf("The date is fine\n");
                }
                else if((d>=1&&d<=28)&&(m==02))
                {
                        printf("The date is fine\n");
                }
                else if((d>=1&&d<=29)&&(y%400==0||y%4==0||y%100!=0))
                {
                        printf("The date is fine\n");
                }
                else
                {
                        printf("The day of dob is not fine\n");
                }
             }
                else
                {
                        printf("The month of dob is not fine\n");
                }
             
             
             
        }
        else
        {
        printf("The year of dob is not fine\n");
        }
        if(d<=p)
        {
                int a=p-d;
                a=a+p;
                
                for (m=p;m<p+1;m++)
                {
                        
                        a=a+m;
                }
                printf("The total no.of days strictly between 2 given dates is:- %d\n",a);
        }
        else if(m<=q)
        {
                if(d<=p)
                {
                        printf("The total no.of days strictly between 2 given dates is:- %d\n",p-d);
                }
        }
        else
        {
                printf("The current date precedes the dob");
        }

        return 0;.
        

        
}
