public class jobs01{
    public static void main(String[] args) {
            System.out.println("Test 1 : ");
            Rectangle rect = new Rectangle(12.5, 4.0);
            System.out.println(rect);
            System.out.println();
            System.out.println("Test 2 : ");
            RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
            System.out.println(rect1);
            System.out.println();

            System.out.println("Test 3 : ");
            RectangleColore rect2 = new RectangleColore(25.0/2, 8.0/2, new String("rouge"));
            System.out.println(rect2);


            System.out.println(rect1.equals(rect2));
            System.out.println(rect2.equals(rect1));
            System.out.println(rect1.equals(null));
            System.out.println(rect.equals(rect1));
            System.out.println(rect1.equals(rect));
        }

    static class Rectangle {
    protected double hauteur;
    protected double largeur;
    public Rectangle(double hauteur, double largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    public String toString() {
        return "Rectangle de hauteur " + hauteur + " et de largeur " + largeur;
    }

    public boolean equals( Object obj) {
        if (obj.getClass().getName() != this.getClass().getName()) {
            return false;
        }
        else {
            Rectangle rect = (Rectangle) obj;
            if(this.hauteur == rect.hauteur && this.largeur == rect.largeur) {
                return true;
            }
            else {
                return false;
            }
        }
        
    }
}

    static class RectangleColore extends Rectangle {
        protected String couleur;
        public RectangleColore(double hauteur, double largeur, String couleur) {
            super(hauteur, largeur); // Call the constructor of the parent class Rectangle
            this.couleur = couleur;
        }
        public String toString() {
            super.toString();
            return "Rectangle de hauteur " + hauteur + " et de largeur " + largeur + " et de couleur " + couleur;
        }
        public boolean equals( Object obj) {
            if(!( obj instanceof RectangleColore)) {
                return false;
            }
            else {
                RectangleColore rect = (RectangleColore) obj;
                if(this.hauteur == rect.hauteur && this.largeur == rect.largeur && this.couleur.equals(rect.couleur)) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }

    public class ToStringEq {
        public static void main(String[] args) {
            System.out.println("Test 1 : ");
            Rectangle rect = new Rectangle(12.5, 4.0);
            System.out.println(rect);
            System.out.println();
            System.out.println("Test 2 : ");
            RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
            System.out.println(rect1);
            System.out.println();

            System.out.println("Test 3 : ");
            RectangleColore rect2 = new RectangleColore(25/2, 8.0/2, new String("rouge"));
            System.out.println(rect2);


            System.out.println(rect1.equals(rect2));
            System.out.println(rect2.equals(rect1));
            System.out.println(rect1.equals(null));
            System.out.println(rect.equals(rect1));
            System.out.println(rect1.equals(rect));
        }
    }

}