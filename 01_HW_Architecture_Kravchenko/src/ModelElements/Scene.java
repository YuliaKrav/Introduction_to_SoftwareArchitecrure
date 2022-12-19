package ModelElements;

import java.util.ArrayList;

/**
 * The class Scene describes the 3d scene.
 */
public class Scene <Type1, Type2>{
    public int Id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    public Scene(PoligonalModel model, Camera camera) {
        models.add(model);
        cameras.add(camera);
    }

    public Type1 method1(Type1 t) {
        return t;
    }

    public Type2 method2(Type1 t1, Type2 t2) {
        return t2;
    }
}
