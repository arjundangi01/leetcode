class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k = k%n;
       nums = rev(nums,0,n-1);
       nums= rev(nums,0,k-1);
       nums = rev(nums,k,n-1);
       
        
    }
  static int[] rev(int []arr, int i, int j)
 {
    while(i<j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        
    }
    return arr;
 }
}
