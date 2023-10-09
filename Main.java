import java.util.Scanner;

import Model.Animals;
import Model.Model;
import Model.Packs;
import Model.Pets;

public class Main {
    public static void main(String[] args) {
        // Pets dog1 = new Pets("dog1");
        // dog1.command("bark");
        // dog1.command("run");

        // // 14.3 увидеть список команд, которое выполняет животное
        // System.out.println(dog1.toString());;


        // view.setPresenter(new Presenter(view, new Model()));

        View view = new View();
        Model model = new Model();

        Presenter p = new Presenter(view, model);
        boolean programIsActive = true;
        Scanner in = new Scanner(System.in);

        while (programIsActive) {
            p.viewShowMenu();
            
            String command = in.nextLine();

            switch(command){
                case "1":
                    p.showAnimals();
                    break;
                case "2":
                    p.viewShowName();
                    String petName = in.nextLine();
                    Pets pet = p.addPet(petName);
                    p.viewAddCommand();
                    String petCommand = in.nextLine();
                    pet.command(petCommand);
                    break;

                case "3":
                    p.viewShowName();
                    String packName = in.nextLine();
                    Packs pack = p.addPack(packName);
                    p.viewAddCommand();
                    String packCommand = in.nextLine();
                    pack.command(packCommand);
                    break;

                case "4":
                    programIsActive = false;
                    System.out.println("Program is closing");
                    break;
            }
        }
        in.close();

    }
}
