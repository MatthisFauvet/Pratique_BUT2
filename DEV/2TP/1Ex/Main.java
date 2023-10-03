public class Main {
    public static void main(String[] Args){
        MainModele model = new MainModele();
        MainView view = new MainView(model);
        view.setFirst(model.getData(0));
    }
}