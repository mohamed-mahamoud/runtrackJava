public class FigureGeometriques {
    class Rectangle {
        protected double largeur;
        protected double longueur;
        public Rectangle(double largeur, double longueur) {
            this.largeur = largeur;
            this.longueur = longueur;
        }
        public double surface() {
            return largeur * longueur;
        } 
        public double getLongueur() {
            return longueur;
        }
        public double getLargeur() {
            return largeur;
        }
        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }
        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }
    }
    
}
