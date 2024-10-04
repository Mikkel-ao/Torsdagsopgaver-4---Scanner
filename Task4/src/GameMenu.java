import java.util.ArrayList;
public class GameMenu {
    private ArrayList<String>actions;

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public void displayMenu(ArrayList<String> actions) {
        for(String s : actions) {
            System.out.println(s);
        }
    }
}
