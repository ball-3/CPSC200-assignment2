import java.util.Random;

public class TimeSum {

    StopWatch watch;
    Random random;
    private int n;

    public TimeSum (Random random, StopWatch watch, int n)
    {
        this.random = random;
        this.watch = watch;
        this.n = n;

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