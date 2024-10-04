import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("1) Start game ");
        actions.add("2) Resume game ");
        actions.add("3) Pause game ");
        actions.add("4) End game ");
        // System.out.print(actions.get(2));
        GameMenu menu = new GameMenu(actions);
        // menu.displayMenu(actions);
        String userChoice = menu.getAction();
        int convert = Integer.parseInt(userChoice);
        doAction(convert);
    }

    public static void doAction(int actions) {
        switch(actions) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid. Please try again");
                break;
        }
    }
}

