import java.util.ArrayList;
import java.util.Scanner;

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