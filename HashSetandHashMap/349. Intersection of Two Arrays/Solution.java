class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null ){
            return null;
        }
        
        if(nums1.length == 0){
            return nums1;
        }else if(nums2.length == 0){
            return nums2;
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> res = new HashSet<Integer>();
        
        for(int i : nums1){
            set.add(i);
        }
        
        int len2 = nums2.length;
        
        for(int i = 0; i < len2; i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        
        int[] nums = new int[res.size()];
        Iterator<Integer> ite = res.iterator();
        int idx = 0;
        while(ite.hasNext()){
            nums[idx] =  ite.next();
            idx++;
        }
        
        return nums;
        
        
    }
}