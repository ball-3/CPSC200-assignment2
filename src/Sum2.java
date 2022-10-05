public class Sum2 {
    StopWatch watch;
    public Sum2 (StopWatch watch)
    {
        this.watch = watch;
    }

    private long sum2(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<n;j++)
                sum++;
        return sum;
    }
}
