package InMemoryModel;

import ModelElements.*;

import java.util.ArrayList;

/**
 * Class ModelStore describes storage Scene and model elements (Flash, Camera, PoligonalModel)
 */
public class ModelStore implements IModelChanger {
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Scene> scenes = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<Flash>();
    public ArrayList<Camera> cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changedObservers = new ArrayList<>();

    public ModelStore(Texture texture) {
        models.add(new PoligonalModel(texture));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(models.get(0), cameras.get(0)));
    }

    public Scene getScene(int id) {
        if (id < 0 || id >= scenes.size()) {
            return null; // exception in future
        }
        return scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
