public class Sum1 {
    StopWatch watch;
    private int n;
    private int divisor;
    private double[] times;

    public Sum1 (StopWatch watch, int n)
    {
        this.watch = watch;
        this.n = n;
        this.divisor = n/10;                        //CHECK THS MATH IS HBELLA ZUZZZ
        this.times = new double[10];
    }

    public double[] timeSums ()
    {
        for (int i = 0; i < 10; i ++)
        {
            watch.stop().reset().start();
            //              FIX THISSSS OMGGGGG                 sum1(n/(i*divisor));
            times[i] = watch.stop().elapsed();
        }
    }
    private long sum1(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            sum++;
        return sum;
    }
}
