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
        }
}
