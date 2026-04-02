public class TestCalcule {
    public static void main(String[] args) {
        final long max = 10_000_000L;
        final int nombreThreads = 100;
        long somme = 0;

        calcule[] tab = new calcule[nombreThreads];
        long tailleBloc = max / nombreThreads;
        long startGlobal = System.nanoTime();

        for (int i = 0; i < tab.length; i++) {
            long debut = i * tailleBloc + 1;
            long fin = (i == tab.length - 1) ? max : (i + 1) * tailleBloc;
            tab[i] = new calcule(debut, fin);
            tab[i].start();
        }

        for (int i = 0; i < tab.length; i++) {
            try {
                tab[i].join();
                somme += tab[i].somme;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        long endGlobal = System.nanoTime();
        long sommeAttendue = max * (max + 1) / 2;
        double elapsedMs = (endGlobal - startGlobal) / 1_000_000.0;

        System.out.println("Somme totale : " + somme);
        System.out.printf("Temps d'execution : %.3f ms%n", elapsedMs);
    }
}
