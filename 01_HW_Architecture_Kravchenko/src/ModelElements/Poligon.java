package ModelElements;

import BaseTypes.Point3D;

import java.util.ArrayList;

/**
 * The class Poligon describes the poligon.
 */
public class Poligon {
    public ArrayList<Point3D> points = new ArrayList<>();

    public Poligon(Point3D point) {
        points.add(point);
    }
}
