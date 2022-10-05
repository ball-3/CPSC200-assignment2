public class Sum5 {
    StopWatch watch;

    public Sum5 (StopWatch watch)
    {
        this.watch = watch;
    }

    private long sum5(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<i*i;j++)
                for(int k=0;k<j;k++)
                    sum++;
        return sum;
    }
}
