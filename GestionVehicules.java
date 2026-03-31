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

    
}
