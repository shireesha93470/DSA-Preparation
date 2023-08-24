public class PerfectSqurare {
    public static void main(String[] args)
    {
        int num=23;
        for(int i=0;i<=num/2;i++)
        {
            if(i*i==num)
            {
                System.out.println("perfect square");
                return ;
            }
        }
        System.out.println("not");
    }
}
