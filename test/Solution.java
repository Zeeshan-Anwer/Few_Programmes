package test;

public class Solution{
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));
	}
    public static boolean isPalindrome(int x) {
        
        int orgnum=x,sum=0,rem=0;
        
        while(x>0)
        {
            rem+=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
     
        if(orgnum==sum)
            return true;
        else
            return false;
        
        
    }
}