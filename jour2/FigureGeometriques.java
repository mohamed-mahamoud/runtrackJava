public class FigureGeometriques {
    class Figure{
        protected  double x;
        protected double y;
        public Figure(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public void affiche() {
            System.out.println("Figure de centre (" + x + ", " + y + ")");
        }
        public void setCentre(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    
    class Rectangle extends Figure {
        protected double largeur;
        protected double longueur;
        public Rectangle(double largeur, double longueur) {
            super(0, 0); // Call the constructor of the parent class Figure
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
    class Cercle extends Figure {
        protected double rayon;
        public Cercle(double x, double y, double rayon) {
            super(x, y);
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
    class RectangleColore extends Rectangle {
        protected int couleur;
        public RectangleColore(double largeur, double longueur, int couleur) {
            super(largeur, longueur);
            this.couleur = couleur;
        }

    }
}