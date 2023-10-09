package Model;
import java.util.ArrayList;
import java.util.List;

public class Pets extends Animals{
    private String name;
    private List<String> petDo;


    public Pets(String name){
        this.name = name;
        this.petDo = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void command(String animalDo){
        this.petDo.add(animalDo);
    }

    @Override
    public String toString() {
        return String.format("%s: %s do commands %s ", this.getClass().getSimpleName(), getName(), this.petDo.toString());
    }
}
