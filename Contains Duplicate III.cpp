class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        vector<pair<long,long>> v(nums.size());
        for(int i=0;i<nums.size();i++)
        {
            v[i].first=nums[i];
            v[i].second=i;
        }
        sort(v.begin(),v.end());
        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(abs(v[i].first-v[j].first) <=t)
                {
                    if(abs(v[i].second-v[j].second)<=k)
                    {
                        return true;
                    }
                }
                else break;
            }
        }
        return false;
    }
};
