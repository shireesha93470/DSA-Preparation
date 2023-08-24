public class pattern3 {
    public static void main(String[] args)
    {
        int num=5;
        for(int i=1;i<=num-2;i++)
        {
            String str = "";
            for(int j=1;j<=num;j++)
            {
                if(i==1)
                {
                    str+="*"+" ";
                }
                else if(j==1)
                {
                    str+="*";
                }
                
            }
            System.out.println(str);
        }
    }
    
}
