class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> mpp= new HashMap<>();
       for(String s:strs){
        char[] arr=s.toCharArray();//['a','c','t']
        Arrays.sort(arr);//[a,c,t]
        String sortedWord=new String(arr);//act
        if(!mpp.containsKey(sortedWord)){
            mpp.put(sortedWord,new ArrayList<>());
        }mpp.get(sortedWord).add(s);
       }
       List<List<String>> res=new ArrayList<>(mpp.values());
       return res;
    }
}
