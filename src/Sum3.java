public class Sum3 {
    StopWatch watch;

    public Sum3 (StopWatch watch)
    {
        this.watch = watch;
    }

    private long sum3(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<n*n;j++)
                sum++;
        return sum;
    }

}
