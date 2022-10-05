import java.util.Random;

public class TimeSum {
    StopWatch watch;
    Sum1 sum1;
    Sum2 sum2;
    Sum3 sum3;
    Sum4 sum4;
    Sum5 sum5;
    Sum6 sum6;

    public TimeSum (StopWatch watch)
    {
        this.watch = watch;

        sum1 = new Sum1(watch, n1);
        sum2 = new Sum2(watch, n2);

        //do thie thing
    }

    private void timeSum (int sumNumber)
    {

    }
}

/*
    public double timeAddition()
    {
        watch.reset();
        this.addBigIntegers();
        return (watch.elapsed()/n);
    }


    private void addBigIntegers()
    {
        for (int i = 0; i < n; i++)
        {
            watch.start();
            bigIntegers[i].add(addends[i]);
            watch.stop();
        }
    }


    private void generateBigIntegers()
    {
        for (int i = 0; i < n; i++)
        {
            bigIntegers[i] = new BigInteger(numBits, random);
            addends[i] = new BigInteger(numBits, random);
        }
    }
}
 */