public class StopWatch {

    private double elapsed;
    private boolean isRunning;
    private long startTime;
    private long endTime;

    /**
     * @return elapsed time in seconds
     */
    public double elapsed()
    {
        if (!isRunning)
        {
            return this.elapsed/1000000000;
        }

        return (System.nanoTime() - startTime)/1000000000;
    }

    public boolean isRunning()
    {
        return this.isRunning;
    }

    /**
     * Creates new StopWatch with elapsed time 0 and isRunning false.
     */
    public StopWatch()
    {
        this.elapsed = 0.0;
        this.isRunning = false;
    }

    /**
     * Begins stopwatch if not already started
     * @return this
     */
    public StopWatch start()
    {
        if (!this.isRunning)
        {
            this.isRunning = true;
            this.startTime = System.nanoTime();
        }

        return this;
    }

    /**
     * Stops stopwach if not already stopped, finds running time
     * @return this
     */
    public StopWatch stop()
    {
        if (this.isRunning)
        {
            this.endTime = System.nanoTime();
            this.isRunning = false;
            findElapsed();
        }

        return this;
    }

    /**
     * Resets the
     * @return this
     */
    public StopWatch reset()
    {
        if (this.isRunning)
        {
            //if the watch is active, startTime must be altered (elapsed is not calculated unitl watch stops)
            this.startTime = System.nanoTime();
            return this;
        }
        //if the watch is stopped, setting elapsed to zero resets effective elapsed
        this.elapsed = 0.0;

        return this;
    }

    /**
     * Sets elapsed based on endTime and startTime
     */
    private void findElapsed()
    {
        elapsed += endTime - startTime;
    }

}
