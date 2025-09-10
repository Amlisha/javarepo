#include <stdio.h>
#include <set>

using namespace std;

int main()
{
    set<int> num={1,3,2};
    for(int i:num) 
    cout<<" "<<i;
    cout<<endl;

    num.insert(10);
    for (int i:num)
    cout<<" "<<i;
    cout<<endl;

set<string> alpha={"hello "};
for (string i:alpha)
{
    cout<<" "<<i;
}
cout<<" "<<i;

set<char> character={'a','b','1'};
for (char i:character)
{
    cout<<" "<<i;
}
return 0;
}