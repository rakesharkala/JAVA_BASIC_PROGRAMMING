class prime_range
{
    public static void main (String args[])
    {

        int start=10,end=20,sum=0,alt=0;
        for (;start<end;start++)
        {
            int count=0;
            for(int i=2;i<=start/2;i++)
            {
                if (start%i==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                if(alt%2==0){
                System.out.println(start);
                sum=sum+start;
                }
                alt++;
            }
        }
        System.out.println("sum of primes is : "+sum);
    }
}