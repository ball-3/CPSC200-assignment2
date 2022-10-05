public class Sum6 {
 StopWatch watch;

    public Sum6 (StopWatch watch)
    {
        this.watch = watch;
    }

    private long sum6(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<i*i;j++)
                if (j % i == 0)
                    for(int k=0;k<j;k++)
                        sum++;
        return sum;
    }
}
