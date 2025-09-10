#include <stdio.h>
#include <stdlib.h>

int main()
{
    int A [5]={1,2,3,4,5};
    int B [3]={4,5,7};
    int C [8];
    int i,j,k=0,flag,n=0;

    for(i=0;i<5;i++)
    { flag=0;
        for(j=0;j<3;j++)
{ if(A[i]==B[j])
{flag=1;
        break;
    }
    }
    if(flag==0)
{C[k]= A[i];
    k++;
    n++;
}
    }
    for(k=0;k<n;k++)
    printf(" %d" , C[k]);
}
    