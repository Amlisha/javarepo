#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A,B,C,D;
    char num[4]={'1','2','3','4'};
    char alpha[4]={'A','B','C','D'};
    char C[8];
    int i,j,k=0,flag=0;

    for(i=0;i<4;i++)
    {
        C[k]=num[i];
        k++;
    }
    {
        C[k]=alpha[i];
        k++;
}
    for(i=0;i<8;i++)
    printf(" %c " ,C[i]);
}