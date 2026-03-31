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
    class Cercle{
        protected double x;
        protected double y;
        protected double rayon;
        public Cercle(double x, double y, double rayon) {
            this.x = x;
            this.y = y;
            this.rayon = rayon;
        }
        public void affiche(){
            System.out.println("Cercle de centre (" + x + ", " + y + ") et de rayon " + rayon);
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double getRayon() {
            return rayon;
        }
        public void setX(double x) {
            this.x = x;
        }
        public void setY(double y) {
            this.y = y;
        }
        public void setRayon(double rayon) {
            this.rayon = rayon;
        }
        public void setCentre(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double surface() {
            return Math.PI * rayon * rayon;
        }
        public boolean estInterieur(double x, double y) {
            double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
            return distance < rayon;
        }
    }
}
