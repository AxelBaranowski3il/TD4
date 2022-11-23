package EX1;

public class Rectangle {
  private double largeur;
  private double hauteur;

  public Rectangle(double largeur, double hauteur){
    this.largeur = largeur;
    this.hauteur = hauteur;
  }

  @Override 
  public String toString() {
    return "Rectangle de hauteur = " + hauteur + " et de largeur = " + largeur;
  }

  @Override 
  public boolean equals(Object a) {
    boolean retVal = false; 
    if (a == this)
      return true;
    if (a == null)
      return false;
    if (!a instanceof Rectangle)
      return false;
    Rectangle a = (Rectangle)a;
    if (largeur == a.largeur && hauteur == a.hauteur)
      return true
  
    return this == a;
  }
}