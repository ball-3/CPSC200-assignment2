import java.util.Random;

public class Main {
    public static void main(String[] args) {
            StopWatch watch = new StopWatch();
            StopWatchTest test = new StopWatchTest(watch);
            Random random = new Random();
                                                                    //rename plis
            TimeSum trial1 = new TimeSum(random, watch, 1000);

            //test.testStopwatch();
    }
}
