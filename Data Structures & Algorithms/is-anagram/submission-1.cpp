class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> freq1;
        for(char ch:s){
            freq1[ch]++;
        }
        for(char ch:t){
            freq1[ch]--;
        }
        for(auto res:freq1){
            if(res.second==0)return true;
            else return false;
        }
    }
};
