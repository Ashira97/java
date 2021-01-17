#include <vector>
#include <iostream>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        bool flag = false;
        vector<int> result = {0,1};
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j] == target){
                    flag = true;
                    result[0] = i;
                    result[1] = j;
                }
            }
            if(flag){
                break;
            }
        }
        cout<<result[0]<<endl;
        cout<<result[1]<<endl;
        return result;
    }
};

int main() 
{
    vector<int> result = {3,2,4};
    int target = 6;
    Solution s;
    s.twoSum(result,target);
    return 0;
}