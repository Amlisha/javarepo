#include <stdio.h>
#include <stdlib.h>

int main()
{
    char num[5]={'1','2','3','E'};
    char alpha[5]={'A','B','D','E'};
    char C[10];
    int i,l,k=0;
    
    for(i=0;i<5;i++)
    {
        for(j=0;j<5;j++)
        {
            if(num[i]==alpha[j])
            C[k]=alpha[j];
        }
        k++;
    }
    for(i=0;i<10;i++)
    printf(" %c ",C[i]);
}