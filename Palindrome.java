public class Palindrome
{
    public static void main(String[] args)
    {
        String str="racecar";
        System.out.println(ispalindrome(str)); 
    }
    public static boolean ispalindrome(String str)
    {
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
       
        }
        return true;
    }

}

