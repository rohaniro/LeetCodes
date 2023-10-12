class Solution 
{
    public int removeElement(int[] a, int val) 
    {
        int count =0;
        for(int i=0; i<a.length; i++)
        {
            if(val != a[i])
            {
                a[count] = a[i]; 
                count++; 
            } 
            
        } return count; 
    }
} 