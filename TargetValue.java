public class TargetValue {
    public static void main(String[] args)
    {
        int[] arr={2,3,4,6,8,1};
        int num=10;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==num)
                {
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                }
                break;
            }
          
        }
        
    }
    
}
