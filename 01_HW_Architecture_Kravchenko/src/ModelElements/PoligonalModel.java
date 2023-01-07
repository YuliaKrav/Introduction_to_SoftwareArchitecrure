package ModelElements;

import BaseTypes.Point3D;

import java.util.ArrayList;

/**
 * The class  PoligonalModel describes the polygonal model.
 */
public class PoligonalModel {
    public ArrayList<Poligon> poligons;
    public ArrayList<Texture> textures;

    public PoligonalModel(ArrayList<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<>();
    }
}