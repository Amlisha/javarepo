//Practical 7 union of two sets
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A,B,C,D;
    char num[5]={'1','2','3','4','E'};
    char alpha[5]={'A','B','C','D','E'};
    char C[10];
    int i,j,k=0,flag=0;

    for(j=0;j<5;j++)
    {
        C[k]=num[j];
        k++;
    }

    for(i=0;i<5;i++)
    {
        {
            for(i=0,i<10,i++)
        {
            flag = 0;
            if(alpha[j]==C[i])
            {
                flag = 1;
                break;
            }
        }
        if(flag ==0 )
    {
        C[k]=alpha[j];
        k++;
}
}
    for(i=0;i<10;i++)
    printf(" %c " ,C[i]);
}