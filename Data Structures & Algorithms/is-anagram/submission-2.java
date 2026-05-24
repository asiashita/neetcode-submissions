class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)-1);
        }
        for(int value:mpp.values()){
            if(value!=0)return false;
            
        }return true;
    }
}
