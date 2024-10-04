import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
    private ArrayList<String>actions = new ArrayList<String>();

    public GameMenu(ArrayList<String> actions) {
        this.actions = actions;
    }

    public void displayMenu(ArrayList<String> actions) {
        for(int i = 0; i < actions.size(); i++) {
            System.out.println(actions.get(i));
        }

    }
    // 5.a
    public String getAction() {
        System.out.println("Type a number to choose an action ");
        displayMenu(actions);
        // 5.b
        Scanner scanner = new Scanner(System.in);
        // 5.c
        String choice = scanner.nextLine();
        return choice;

    }
}