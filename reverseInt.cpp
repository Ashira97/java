#include <cmath>
using namespace std;
class Solution {
public:
    int reverse(int x) {
        bool positive = true;
        if(x==0 | x>__INT32_MAX__){
            return 0;
        }
        if(x<0){
            x = abs(x);
            positive = false;
        }
        char[] c = change()
    }
};