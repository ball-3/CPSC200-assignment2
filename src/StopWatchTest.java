import java.util.Scanner;

//this class is not used but I used it to test stopwatch accuracy so I have kept it for handin
//it's not super precise and has some extra inside the timing, so relies on timing for a long time
//see bottom of code for the accuracy results
public class StopWatchTest {

    Scanner scanner = new Scanner(System.in);
    StopWatch watch;

    public StopWatchTest (StopWatch watch)
    {
        this.watch = watch;
    }

    public void testStopwatch()
    {
        watch.stop().reset();
        System.out.println("start = 1, stop = 0, reset = 2, show time = 3");

        int i = 0;
        while (i < 20)
        {
            theSwitch();
            i++;
        }

    }

    private void theSwitch()
    {
        switch (scanner.nextInt()) {
            case 0:
                watch.stop();
                System.out.println("stopped at " + watch.elapsed());
                break;
            case 1:
                watch.start();
                System.out.println("started at " + watch.elapsed());
                break;
            case 2:
                System.out.println("reset at " + watch.elapsed());
                watch.reset();
                break;
            case 3:
                System.out.println("elapsed is: " + watch.elapsed());
                break;
            default:
                System.out.println("Wot u doing m8??");
                break;
        }
    }
}