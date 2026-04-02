
public class ComptageThread extends Thread {
    private static final Object verrou = new Object();
    public  long limit;
    public int pairImpair;
    public static long comptage = 1;

    public ComptageThread(long limit, int pairImpair) {
        this.limit = limit;
        this.pairImpair = pairImpair;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (verrou) {
                try {
                    if (this.pairImpair == 1) {
                        while (comptage <= this.limit && comptage % 2 == 0) {
                            verrou.wait();
                        }
                    } else {
                        while (comptage <= this.limit && comptage % 2 != 0) {
                            verrou.wait();
                        }
                    }

                    if (comptage > this.limit) {
                        verrou.notifyAll();
                        return;
                    }

                    System.out.println(comptage);
                    comptage++;
                    verrou.notifyAll();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
    

