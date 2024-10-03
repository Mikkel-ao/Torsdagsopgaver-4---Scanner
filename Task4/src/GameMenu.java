import java.util.ArrayList;
public class GameMenu {
    private ArrayList<String>actions = new ArrayList<String>();

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public void displayMenu(ArrayList<String> actions) {
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(actions.get(i));
        }

    }
}
