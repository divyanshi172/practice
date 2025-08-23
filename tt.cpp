#include <iostream>;
using namespace std;
int main(){

    int rev=1;
    int n= 1234;
    for(int i=n; i>0; i=i/10){
        int digit=i%10;
        rev=rev*10+digit;
    }
    cout<<rev;

    return 0;

}
