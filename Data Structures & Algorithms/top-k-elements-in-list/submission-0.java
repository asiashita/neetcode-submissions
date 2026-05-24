class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mpp=new HashMap<>();//{}
        for(int i:nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
             
        }
        List<Integer> list= new ArrayList<>(mpp.keySet());//list = [1,2,3]
        list.sort((a,b)-> mpp.get(b)-mpp.get(a)); //3,2,1
        int [] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i);

        }return res;

        
    }
}
