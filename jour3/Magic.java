public class Magic {
    abstract class Carte {
        protected int cout;

        public Carte(int cout) {
            this.cout = cout;
        }

        protected abstract String getType();

        public abstract void afficher();
    }

    class Terrain extends Carte {
        protected String couleur;

        public Terrain(String couleur) {
            super(0);
            this.couleur = couleur;
        }

        protected String getType() {
            return "Terrain";
        }

        public void afficher() {
            System.out.println("Carte de type " + getType() + " et de couleur " + couleur + " avec un coût de " + cout);
        }
    }

    class Creature extends Carte {
        protected String nom;
        protected int degat;
        protected int pointDeVie;

        public Creature(String nom, int degat, int pointDeVie, int cout) {
            super(cout);
            this.nom = nom;
            this.degat = degat;
            this.pointDeVie = pointDeVie;
        }

        protected String getType() {
            return "Creature";
        }

        public void afficher() {
            System.out.println(
                "Carte de type " + getType() +
                " avec un coût de " + cout +
                ", " + degat + " dégâts et " + pointDeVie + " points de vie"
            );
        }
    }

    class Sort extends Carte {
        protected String nom;
        protected String effet;

        public Sort(String nom, String effet, int cout) {
            super(cout);
            this.nom = nom;
            this.effet = effet;
        }

        protected String getType() {
            return "Sort";
        }

        public void afficher() {
            System.out.println(
                "Carte de type " + getType() +
                " avec un coût de " + cout +
                " et l'effet : " + effet
            );
        }
    }
    class Jeu{
        protected Carte[] main;
        protected Carte[] pioche;
        public Jeu(Carte[] pioche, Carte[] main) {
            this.pioche = pioche;
            this.main = main;
        }
        public void piocher() {
            if(pioche.length > 0) {
                Carte cartePiochee = pioche[0];
                main[main.length - 1] = cartePiochee;
                // Remove the drawn card from the pioche
                for (int i = 0; i < pioche.length - 1; i++) {
                    pioche[i] = pioche[i + 1];
                }
                pioche[pioche.length - 1] = null; // Clear the last slot
            }
        }

        public void jouerCarte(int index) {
            if (index >= 0 && index < main.length && main[index] != null) {
                Carte carteJouee = main[index];
                carteJouee.afficher();
                main[index] = null; // Remove the card from the hand after playing
            }
        }
    }

}

