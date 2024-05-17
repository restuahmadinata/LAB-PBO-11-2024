package No1;
import java.util.concurrent.Future;

class BackgroundThread implements Runnable {
    private final UiThread uiThread;
    public Future<?> future;

    public BackgroundThread(UiThread uiThread) {
        this.uiThread = uiThread;
    }

    public void run() {
        int executionTime = TaskTimeHelper.getRandomExecutionTime();

        try {
            Thread.sleep(executionTime * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (executionTime > 4) {
            System.out.println("Request Timeout");
            uiThread.incrementFailedData();
        } else {
            uiThread.incrementLoadedData();
        }
    }
}