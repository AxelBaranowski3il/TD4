package EX1;

public class RectangleColore extends Rectangle {
  private String couleur;

  public RectangleColore (double largeur, double hauteur, String couleur) {
    super(largeur, hauteur);
    this.couleur = couleur;
  }

  @Override 
  public String toString() {
    return super.toString() + "\ncouleur = " + couleur;
  }

  @Override
  public boolean equals(Object a) {
    boolean var1 = super.equals(a);
    boolean var2 = false;
    if (!(a instanceof RectangleColore))
      var2 = false;
    RectangleColore rc = (RectangleColore) a;
    if (this.couleur == null)
      return rc.couleur == null;
    if (this.couleur.equals )
  }
}