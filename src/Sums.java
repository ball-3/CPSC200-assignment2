public class Sums
{
    public static long sum1(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            sum++;
        return sum;
    }

    public static long sum2(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<n;j++)
                sum++;
        return sum;
    }

    public static long sum3(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<n*n;j++)
                sum++;
        return sum;
    }

    public static long sum4(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<i;j++)
                sum++;
        return sum;
    }


    public static long sum5(int n)
    {
        long sum = 0;
        for(int i=0; i<n; i++)
            for(int j=0;j<i*i;j++)
                for(int k=0;k<j;k++)
                    sum++;
        return sum;
    }

    public static long sum6(int n)
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
