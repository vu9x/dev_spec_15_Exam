import java.util.List;
import java.util.Scanner;

import Model.*;


public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model){
        this.view = view;
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public Model getModel() {
        return model;
    }

    public void viewShowMenu(){
        getView().showMenu();
    }

    public void showAnimals(){
        for (Animals animal : model.getAnimals()) {
            System.out.println(animal);
        }
    }

    public Pets addPet(String name) {
        return model.addPet(new Pets(name));
    }

    public Packs addPack(String name) {
        return model.addPack(new Packs(name));
    }

    public String name(){
        Scanner in = new Scanner(System.in);
        String newName = in.nextLine();
        in.close();

        return newName;
    }

    public void viewShowName(){
        getView().printName();
    }

    public void viewAddCommand(){
        getView().addCommand();
    }
}
