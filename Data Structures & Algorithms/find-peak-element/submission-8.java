class Solution {
    public int findPeakElement(int[] nums) {
        //alwas compare with neighbors
        // left and right element should be leass then peack element 
        // if there is no left element or nor any right element it means at index 0 and n-1 will comapred with -infinity 
        // in binary search there is a mid element 
        // compare mid element with left and right also 
        // if left < mid > right  then return mid 
        
        int l=0; int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
   
            
           if(nums[mid]<nums[mid+1]){
            l=mid+1;
           
           }else{
            r=mid;
           }
       
            
            
        }
            
            
            return l;
                
        
    } 
}