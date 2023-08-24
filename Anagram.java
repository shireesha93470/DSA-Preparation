public class Anagram {
    public static void main(String[] args) {
        String str="abcd";
        String str1="cdab";
        int[] res=new int[200];
        if(str.length()!=str1.length())
        {
            System.out.println("Not An Anagram");
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                res[str.charAt(i)]++;
            }
            for(int i=0;i<str1.length();i++)
            {
                res[str1.charAt(i)]--;
            }
            for(int i=0;i<res.length;i++)
            {
                if(res[i]!=0)
                {
                    System.out.println("Not An Anagram");
                    return;
                }
            }
             System.out.println("Anagram");
        }
    }
}
