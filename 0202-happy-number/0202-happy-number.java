class Solution {
    public boolean isHappy(int n) {
        
            int y = check(n);
            
            while(y!=1){
                y = check(y);
                if(y==4)
                {
                    return false;
                    
                }
            }
            return true;
    }
     static int check(int num)
    {
        int sum = 0;
        int rem =0;
        while(num!=0)
        {
            rem = num%10;
            sum += rem*rem;
            num = num/10;
        }
        return sum;
        
        
        
    }
}