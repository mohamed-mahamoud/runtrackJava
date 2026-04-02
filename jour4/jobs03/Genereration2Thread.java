

public class Genereration2Thread extends Thread {
    private long length;
    private String randomText;

    public Genereration2Thread(long length) {
        this.length = length;
        this.randomText = "";
    }

    @Override
    public void run() {
        for (long i = 0; i < length; i++) {
            randomText += (char) (new java.util.Random().nextInt(26) + 'a');
        }
    }

    public String getRandomText() {
        return randomText;
    }

    
    
}
