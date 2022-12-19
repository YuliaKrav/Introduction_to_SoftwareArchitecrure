package ModelElements;

import BaseTypes.Point3D;

/**
 * The class  PoligonalModel describes the polygonal model.
 */
public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

    public PoligonalModel(Texture textures) {
        this.textures = textures;
        poligons = new Poligon(new Point3D());
    }
}