public class calcule extends Thread {
    private long start;
    private long end;
    public long somme;

    public calcule(long start, long end) {
        this.start = start;
        this.end = end;
        somme = 0;
    }

    @Override
    public void run() {
        for (long n = start; n <= end; n++) {
            somme += n;
        }
    }
}
