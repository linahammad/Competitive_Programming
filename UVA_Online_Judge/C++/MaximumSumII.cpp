#include<stdio.h>
int main() {


    int n,list[1000],i,j,m;
    while(scanf("%d",&n) && n) {

        for(i=0,j=0; i<n; i++) {

            scanf("%d",&m);
            if(m)
                list[j++]=m;
        }
        for(i=0; i<j; i++) {
            if(!i)
                printf("%d",list[i]);
            else printf(" %d",list[i]);
        }
        if(!j)printf("0");
        printf("\n");
    }
    return 0;
}