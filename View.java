public class View {

    private Presenter presenter;

    // public View(){
    //     showMenu();
    // }

    public void showMenu(){
        System.out.println("1. Показать всех животных\n" + 
                            "2. Добавить домашнее животное\n" + 
                            "3. Добавить вьючное животное\n" +
                            "4. Выйти");
    }

    public void setPresenter(Presenter p){
        this.presenter = p;
    }

    public void noAnimalsInList(){
        System.out.println("List of animals is empty. Please, add new pet or pack");
    }

    public void printName(){
        System.out.println("Please add the name of new animal.");
    }

    public void addCommand(){
        System.out.println("Please add the command for new animal.");
    }
}

