public class GestionVehicules {
        class Vehicule {
        protected String marque;
        protected String dateAchat;
        protected double prixAchat;
        protected double prixCourant;
        public Vehicule(String marque, String dateAchat, double prixAchat) {
            this.marque = marque;
            this.dateAchat = dateAchat;
            this.prixAchat = prixAchat;
        }

        public void affiche(){
            System.out.println("Marque : " + marque);
            System.out.println("Date d'achat : " + dateAchat);
            System.out.println("Prix d'achat : " + prixAchat);
        }
        public void calculerPrix(int anneeActuelle) {
            int age = anneeActuelle - Integer.parseInt(dateAchat.substring(dateAchat.length() - 4));
            this.prixCourant = prixAchat-(prixAchat*0.1*age);
        }

    }
        class Voiture extends Vehicule {
            protected String cylindre;
            protected int nombrePortes;
            protected double puissance;
            protected double kilometrage;
            public Voiture(String marque, String dateAchat, double prixAchat, String cylindre, int nombrePortes, double puissance, double kilometrage) {
                super(marque, dateAchat, prixAchat);
                this.cylindre = cylindre;
                this.nombrePortes = nombrePortes;
                this.puissance = puissance;
                this.kilometrage = kilometrage;
            }
            public void affiche(){
                super.affiche();
                System.out.println("Cylindre : " + cylindre);
                System.out.println("Nombre de portes : " + nombrePortes);
                System.out.println("Puissance : " + puissance);
                System.out.println("Kilometrage : " + kilometrage);
            }
            public void calculerPrix(int anneeActuelle) {
                super.calculerPrix(anneeActuelle);
                int parcours = (int) (kilometrage / 10000);
                this.prixCourant = prixCourant - (prixCourant * 0.05 * parcours);
                if (this.marque.equalsIgnoreCase("Renault") || this.marque.equalsIgnoreCase("Fiat")) {
                    this.prixCourant = prixCourant - (prixCourant * 0.1);
                }
                if (this.marque.equalsIgnoreCase("Mercedes") || this.marque.equalsIgnoreCase("Ferrari")) {
                    this.prixCourant = prixCourant + (prixCourant * 0.2);
                }
                if (this.prixCourant < 0) {
                    this.prixCourant = 0;
                }
            }
    }
        class Avion extends Vehicule {
            protected String moteur;
            protected double heuresVol;
            public Avion(String marque, String dateAchat, double prixAchat, String moteur, double heuresVol) {
                super(marque, dateAchat, prixAchat);
                this.moteur = moteur;
                this.heuresVol = heuresVol;
            }
            public void affiche(){
                super.affiche();
                System.out.println("Moteur : " + moteur);
                System.out.println("Heures de vol : " + heuresVol);
            }
            public void calculerPrix(int anneeActuelle) {
                super.calculerPrix(anneeActuelle);
                if (this.moteur.equalsIgnoreCase("hélices")) {
                    int vol = (int) (heuresVol / 100);
                    this.prixCourant = prixCourant - (prixCourant * 0.10 * vol);
                }
                else {
                    int vol = (int) (heuresVol / 1000);
                    this.prixCourant = prixCourant - (prixCourant * 0.10 * vol);
                }
                if (this.prixCourant < 0) {
                    this.prixCourant = 0;
                }   
            }
        }
}
