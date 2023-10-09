package Model;

import java.util.ArrayList;
import java.util.Collection;

public class Model {
    private Collection<Animals> animals;

    public Model(){
        this.animals = new ArrayList<Animals>();
    };


    public Pets addPet(Pets animal) {
        animals.add(animal);
        return animal;
    }

    public Packs addPack(Packs animal) {
        animals.add(animal);
        return animal;
    }

    public Collection<Animals> getAnimals() {
        return animals;
    }
}
