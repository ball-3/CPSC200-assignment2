public class Sum4 {
    StopWatch watch;

    public Sum4 (StopWatch watch)
    {
        this.watch = watch;
    }

    private long sum4(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<i;j++)
                sum++;
        return sum;
    }
}
