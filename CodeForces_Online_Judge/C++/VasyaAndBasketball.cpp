493C

#include<stdio.h>
#include<iostream>
#include<string.h>
#include<algorithm>
#include<string>
#include<stack>
#include<math.h>
#include<vector>
#include<set>
#include<map>
#define nn 110000
#define inff 0x7fffffff
#define eps 1e-8
#define mod 1000000007
typedef long long LL;
const LL inf64=LL(inff)*inff;
using namespace std;
int n,m;
struct node
{
    int val;
    int id;
    node(){}
    node(int x,int y)
    {
        val=x,id=y;
    }
}a[4*nn];
bool cmp(node xx,node yy)
{
    return xx.val<yy.val;
}
int ans1,ans2,cha;
void solve(int x,int y)
{
    int ix=x*2+(n-x)*3;
    int fc=y*2+(m-y)*3;
    if(ix-fc>cha)
    {
        cha=ix-fc;
        ans1=ix,ans2=fc;
    }
    else if(ix-fc==cha)
    {
        if(ix>ans1)
        {
            ans1=ix,ans2=fc;
        }
    }
}
int main()
{
    int i,x;
    while(scanf("%d",&n)!=EOF)
    {
        int ix=0;
        for(i=1;i<=n;i++)
        {
            scanf("%d",&x);
            a[++ix]=node(x,1);
        }
        scanf("%d",&m);
        for(i=1;i<=m;i++)
        {
            scanf("%d",&x);
            a[++ix]=node(x,2);
        }
        sort(a+1,a+ix+1,cmp);
        cha=-inff;
        int i1,i2;
        i1=i2=0;
        solve(i1,i2);
        a[ix+1]=node(-1,0);
        for(i=1;i<=ix;i++)
        {
            if(a[i].id==1)
            {
                i1++;
            }
            else
                i2++;
            if(a[i].val!=a[i+1].val)
            {
                solve(i1,i2);
            }
        }
        printf("%d:%d\n",ans1,ans2);
    }
    return 0;
}
