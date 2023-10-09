package Model;
import java.util.ArrayList;
import java.util.List;

public class Packs extends Animals{
    private String name;
    private List<String> packDo;

    public Packs(String name){
        this.name = name;
        this.packDo = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }
    
    @Override
    public void command(String animalDo){
        this.packDo.add(animalDo);
    }

    @Override
    public String toString() {
        return String.format("%s: %s do commands %s ", this.getClass().getSimpleName(), getName(), this.packDo.toString());
    }
}
